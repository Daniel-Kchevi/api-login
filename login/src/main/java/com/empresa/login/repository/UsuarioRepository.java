package com.empresa.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empresa.login.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
