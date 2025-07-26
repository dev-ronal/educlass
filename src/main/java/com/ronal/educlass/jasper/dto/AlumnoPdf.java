package com.ronal.educlass.jasper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlumnoPdf {
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String fechaDeNacimiento;
    private String correo;
    private String telefono;
    private String codigo;
}
