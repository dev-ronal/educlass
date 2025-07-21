package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_clase")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
}
