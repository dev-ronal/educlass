package com.ronal.educlass.controller;

import com.ronal.educlass.dto.CrearUsuarioRequestDTO;
import com.ronal.educlass.dto.UsuarioDTO;
import com.ronal.educlass.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final IUsuarioService usuarioService;

    @PostMapping("/crear")
    public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody CrearUsuarioRequestDTO crearUsuarioRequestDTO){
        return ResponseEntity.ok(this.usuarioService.crearUsuario(crearUsuarioRequestDTO));
    }

    @GetMapping("/buscar-dni/{dni}")
    public ResponseEntity<UsuarioDTO> buscarUsuarioPorDni(@PathVariable(name = "dni") String dniUsuario){
        return ResponseEntity.ok(this.usuarioService.buscarUsuarioPorDni(dniUsuario));
    }
}
