package com.ronal.educlass.service;

import com.ronal.educlass.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    Profesor crearProfesor(Profesor profesor);
    List<Profesor> listarProfesores();
    Optional<Profesor> obtenerPorId(Long id);
    Profesor actualizarProfesor(Long id, Profesor actualizado);
    void eliminarProfesor(Long id);
    Profesor asignarClase(Long profesorId, Long claseId);
}
