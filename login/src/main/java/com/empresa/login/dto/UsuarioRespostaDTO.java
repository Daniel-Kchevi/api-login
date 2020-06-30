package com.empresa.login.dto;

import com.empresa.login.domain.Usuario;

public class UsuarioRespostaDTO {
	
	private Long id;
	
	private String nome;
	
	private String email;
	
	private boolean admin;
	
	private UsuarioRespostaDTO(Long id, String nome, String email, boolean admin) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.admin = admin;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean admin() {
		return admin;
	}
	
	public static UsuarioRespostaDTO transformatoEmDTO(Usuario usuario) {
		return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
	}
}