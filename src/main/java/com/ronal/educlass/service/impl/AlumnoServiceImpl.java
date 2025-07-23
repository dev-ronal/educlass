package com.ronal.educlass.service.impl;

import com.ronal.educlass.entity.Alumno;
import com.ronal.educlass.repository.IAlumnoRepository;
import com.ronal.educlass.service.IAlumnoService;
import com.ronal.educlass.utils.AlumnoUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
    private final IAlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(IAlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public Alumno crearAlumno(Alumno alumno) {
        Optional<Alumno> alumnoExistente = this.alumnoRepository.findByDni(alumno.getDni());
        if (alumnoExistente.isPresent()){
            // TODO: lanzar excepción
        }
        String codAlumno = AlumnoUtils.generarCodAlumno(alumno);
        String correoAlumno = AlumnoUtils.generarCorreoAlumno(codAlumno);

        alumno.setCodigo(codAlumno);
        alumno.setCodigo(correoAlumno);
        return this.alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return this.alumnoRepository.findAll();
    }

    @Override
    public void eliminarAlumno(Long idAlumno) {
        Alumno alumnoEliminar = this.buscarAlumnoPorId(idAlumno);
        this.alumnoRepository.delete(alumnoEliminar);
    }

    @Override
    public Alumno actualizarAlumno(Alumno alumno) {

        Alumno alumnoEncontrado = this.buscarAlumnoPorId(alumno.getId());
        Alumno alumnoActualizado = null;
        if (alumnoEncontrado != null){
            alumnoActualizado = Alumno.builder()
                    .nombre(alumno.getNombre())
                    .apellido1(alumno.getApellido1())
                    .apellido2(alumno.getApellido2())
                    .dni(alumno.getDni())
                    .fechaDeNacimiento(alumno.getFechaDeNacimiento())
                    .correo(alumno.getCorreo())
                    .telefono(alumno.getTelefono())
                    .codigo(alumno.getCodigo())
                    .build();
            this.alumnoRepository.save(alumno);
        }
        return alumnoActualizado;
    }

    @Override
    public Alumno buscarAlumnoPorId(Long idAlumno) {
        Optional<Alumno> alumnoEncontrado = this.alumnoRepository.findById(idAlumno);
        return alumnoEncontrado.orElse(null);
    }
}
