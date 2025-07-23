package com.ronal.educlass.service;

import com.ronal.educlass.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    Alumno crearAlumno(Alumno alumno);
    List<Alumno> listarAlumnos();
    void eliminarAlumno(Long idAlumno);
    Alumno actualizarAlumno(Alumno alumno);
    Alumno buscarAlumnoPorId(Long idAlumno);

}
