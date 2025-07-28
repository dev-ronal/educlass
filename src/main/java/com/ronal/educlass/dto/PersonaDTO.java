package com.ronal.educlass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonaDTO {
    private Long idPersona;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private String genero;
    private String direccion;
    private String telefonoPrincipal;
    private String telefonoSecundario;
    private String emailPersonal;
    private String foto;
    private String estadoCivil;
    private String fechaCreacion;
    private String fechaActualizacion;
}
