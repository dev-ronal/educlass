package com.ronal.educlass.service;

import com.ronal.educlass.dto.CrearUsuarioRequestDTO;
import com.ronal.educlass.dto.UsuarioDTO;
import com.ronal.educlass.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    UsuarioDTO crearUsuario(CrearUsuarioRequestDTO crearUsuarioRequestDTO);
    List<Usuario> listarUsuarios();
    void eliminarUsuario();
    UsuarioDTO actualizarUsuario(UsuarioDTO usuario);
    UsuarioDTO buscarUsuarioPorId(Long idUsuario);
    UsuarioDTO buscarUsuarioPorDni(String dni);
}
