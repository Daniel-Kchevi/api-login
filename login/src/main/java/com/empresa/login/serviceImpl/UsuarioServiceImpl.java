package com.empresa.login.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.login.domain.Usuario;
import com.empresa.login.repository.UsuarioRepository;
import com.empresa.login.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	} 	
	
	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario) ;
	}

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
	

}
