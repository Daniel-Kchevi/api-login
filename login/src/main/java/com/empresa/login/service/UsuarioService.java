package com.empresa.login.service;

import java.util.List;

import com.empresa.login.domain.Usuario;

public interface UsuarioService {
	
	Usuario salvarUsuario(Usuario usuario);
	
	List<Usuario>listar();
}
