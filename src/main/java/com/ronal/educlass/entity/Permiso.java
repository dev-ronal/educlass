package com.ronal.educlass.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_permiso")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermiso;
    private String nombre;
    private String codigo;
    private String descripcion;
}
