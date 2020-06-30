package com.empresa.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.login.domain.Usuario;
import com.empresa.login.dto.UsuarioDTO;
import com.empresa.login.dto.UsuarioRespostaDTO;
import com.empresa.login.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody UsuarioDTO usuarioDTO){
		Usuario usuario = usuarioService.salvarUsuario(usuarioDTO.transformaParaObjeto());
		return new ResponseEntity<>(UsuarioRespostaDTO.transformatoEmDTO(usuario), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar(){
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listar());
	}
	
}
