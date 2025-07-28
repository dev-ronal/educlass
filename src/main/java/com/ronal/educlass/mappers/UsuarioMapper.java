package com.ronal.educlass.mappers;

import com.ronal.educlass.dto.UsuarioDTO;
import com.ronal.educlass.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioMapper mapper = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toUsuarioDto(Usuario usuario);
    Usuario toUsuario(UsuarioDTO usuarioDTO);
}
