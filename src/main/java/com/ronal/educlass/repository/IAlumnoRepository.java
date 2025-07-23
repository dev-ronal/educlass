package com.ronal.educlass.repository;

import com.ronal.educlass.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {

    Optional<Alumno> findByDni(String dni);
}
