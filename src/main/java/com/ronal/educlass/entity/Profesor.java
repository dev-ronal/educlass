package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_profesor")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    private String codProfesor;
    private List<String> especialidad;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    Usuario usuario;
}
