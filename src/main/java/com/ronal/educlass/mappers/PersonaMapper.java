package com.ronal.educlass.mappers;

import com.ronal.educlass.dto.PersonaDTO;
import com.ronal.educlass.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    PersonaMapper mapper = Mappers.getMapper(PersonaMapper.class);

    Persona toPersona(PersonaDTO persona);
}
