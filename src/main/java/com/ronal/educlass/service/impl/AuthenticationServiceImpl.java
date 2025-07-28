package com.ronal.educlass.service.impl;

import com.ronal.educlass.dto.LoginRequestDTO;
import com.ronal.educlass.dto.LoginResponseDTO;
import com.ronal.educlass.entity.Usuario;
import com.ronal.educlass.repository.IUsuarioRepository;
import com.ronal.educlass.security.jwt.service.IJwtService;
import com.ronal.educlass.service.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationServiceImpl implements IAuthenticationService {

    private final IJwtService jwtService;
    private final IUsuarioRepository usuarioRepository;


    @Override

    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {

        Optional<Usuario> usuarioEncontrado = this.usuarioRepository.findByUsername(loginRequestDTO.getUsername());
        if (usuarioEncontrado.isPresent()) {
            return LoginResponseDTO.builder().token(this.jwtService.generarToken(usuarioEncontrado.get())).build();
        }

        return null;
    }
}
