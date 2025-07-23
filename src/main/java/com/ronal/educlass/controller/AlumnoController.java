package com.ronal.educlass.controller;

import com.ronal.educlass.entity.Alumno;
import com.ronal.educlass.service.IAlumnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {

    private final IAlumnoService alumnoService;

    public AlumnoController(IAlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Alumno>> listarAlumnos() {
        List<Alumno> listaAlumnos = this.alumnoService.listarAlumnos();
        return ResponseEntity.ok(listaAlumnos);
    }

    @GetMapping("/buscar-id/{id}")
    public ResponseEntity<Alumno> buscarAlumnoPorId(@PathVariable(name = "id") Long idAlumno) {
        Alumno alumnoEncontrado = this.alumnoService.buscarAlumnoPorId(idAlumno);
        return ResponseEntity.ok(alumnoEncontrado);
    }

    @PostMapping("/crear")
    public ResponseEntity<Alumno> crearAlumno(@RequestBody Alumno alumno) {
        Alumno alumnoCreado = this.alumnoService.crearAlumno(alumno);
        return ResponseEntity.ok(alumnoCreado);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Alumno> actualizarAlumno(@RequestBody Alumno alumno) {
        Alumno alumnoActualizado = this.alumnoService.actualizarAlumno(alumno);
        return ResponseEntity.ok(alumnoActualizado);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarAlumno(@PathVariable(name = "id") Long idAlumno) {
        this.alumnoService.eliminarAlumno(idAlumno);
        return ResponseEntity.ok().build();
    }
}
