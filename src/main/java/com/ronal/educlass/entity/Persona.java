package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tb_persona")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
