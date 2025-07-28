package com.ronal.educlass.dto;

import com.ronal.educlass.entity.Alumno;
import com.ronal.educlass.entity.Profesor;
import com.ronal.educlass.entity.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UsuarioDTO {
    private String idUsuario;
    private String dni;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private Set<Rol> roles = new HashSet<>();
}
