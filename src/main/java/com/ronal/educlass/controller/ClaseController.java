package com.ronal.educlass.controller;

import com.ronal.educlass.entity.Profesor;
import com.ronal.educlass.service.IProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ClaseController {

    private final IProfesorService profesorService;

    public ClaseController(IProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @PostMapping
    public ResponseEntity<Profesor> crear(@RequestBody Profesor profesor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.profesorService.crearProfesor(profesor));
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorService.listarProfesores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtener(@PathVariable Long id) {
        return profesorService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> actualizar(@PathVariable Long id, @RequestBody Profesor profesor) {
        return ResponseEntity.ok(profesorService.actualizarProfesor(id, profesor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        profesorService.eliminarProfesor(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{profesorId}/clases/{claseId}")
    public ResponseEntity<Profesor> asignarClase(
            @PathVariable Long profesorId,
            @PathVariable Long claseId
    ) {
        return ResponseEntity.ok(profesorService.asignarClase(profesorId, claseId));
    }
}
