package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Builder
@Entity
@Table(name = "tb_alumno")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private LocalDate fechaDeNacimiento;
    private String correo;
    private String telefono;
    private String codigo;
}
