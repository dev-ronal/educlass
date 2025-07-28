package com.ronal.educlass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CrearUsuarioRequestDTO {
    private Long idUsuario;
    private String username;
    private String password;
    private String dni;
    private String email;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimoLogin;
    private boolean estaActivo;
    private boolean necesitaCambiarPassword;
    private LocalDate fechaNacimiento;

    private PersonaDTO personaDTO;

}
