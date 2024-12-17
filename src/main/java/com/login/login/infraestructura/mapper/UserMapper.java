package com.login.login.infraestructura.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.Mapping;

import com.login.login.domain.dto.UserDto;
import com.login.login.infraestructura.entity.Usuario;

@Mapper(componentModel = "spring")
public class UserMapper {

    @Mappings({
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "roll", target = "roll"),
        @Mapping(source = "correo", target = "email")
    })
    UserDto toUser (User user);
    List<UserDto> toUsers (List<Usuario> user);

    @InheritInverseConfiguration
    @Mapping(target = "contraseña", ignore = true)

    Usuario toUsuario (UserDto user);
    List<Usuario> toUsuario (List<UserDto> email);



}
