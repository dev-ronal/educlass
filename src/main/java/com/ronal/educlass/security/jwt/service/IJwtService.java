package com.ronal.educlass.security.jwt.service;

import com.ronal.educlass.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

public interface IJwtService {

    String generarToken(Usuario usuario);


    String getUserjnameFromToken(String token);

    boolean isTokenValid(String token, UserDetails userDetails);
}
