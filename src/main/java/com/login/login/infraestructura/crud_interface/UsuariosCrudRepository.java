package com.login.login.infraestructura.crud_interface;

import org.springframework.data.repository.CrudRepository;

import com.login.login.infraestructura.entity.Usuario;

public interface UsuariosCrudRepository extends CrudRepository<Usuario, Long> {
       
}
