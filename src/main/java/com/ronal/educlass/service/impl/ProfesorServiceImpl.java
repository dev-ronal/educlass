package com.ronal.educlass.service.impl;

import com.ronal.educlass.entity.Clase;
import com.ronal.educlass.entity.Profesor;
import com.ronal.educlass.repository.IClaseRepository;
import com.ronal.educlass.repository.IProfesorRepository;
import com.ronal.educlass.service.IProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    private final IProfesorRepository profesorRepo;
    private final IClaseRepository claseRepo;

    public ProfesorServiceImpl(IProfesorRepository profesorRepo, IClaseRepository claseRepo) {
        this.profesorRepo = profesorRepo;
        this.claseRepo = claseRepo;
    }

    @Override
    public Profesor crearProfesor(Profesor profesor) {
        return profesorRepo.save(profesor);
    }

    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepo.findAll();
    }

    @Override
    public Optional<Profesor> obtenerPorId(Long id) {
        return profesorRepo.findById(id);
    }

    @Override
    public Profesor actualizarProfesor(Long id, Profesor actualizado) {
        /*
        Profesor profesor = profesorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        profesor.setNombre(actualizado.getNombre());
        profesor.setCorreo(actualizado.getCorreo());
        */

        return profesorRepo.save(null);
    }

    @Override
    public void eliminarProfesor(Long id) {
        profesorRepo.deleteById(id);
    }

    @Override
    public Profesor asignarClase(Long profesorId, Long claseId) {
        /*
        Profesor profesor = profesorRepo.findById(profesorId)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        Clase clase = claseRepo.findById(claseId)
                .orElseThrow(() -> new RuntimeException("Clase no encontrada"));
        profesor.getClases().add(clase);

         */
        return profesorRepo.save(null);
    }
}
