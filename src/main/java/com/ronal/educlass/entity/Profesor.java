package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "tb_profesor")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @ManyToMany
    @JoinTable(
            name = "tb_profesor_clase",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "clase_id")
    )
    private Set<Clase> clases;
}
