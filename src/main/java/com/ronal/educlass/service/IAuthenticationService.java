package com.ronal.educlass.service;

import com.ronal.educlass.dto.LoginRequestDTO;
import com.ronal.educlass.dto.LoginResponseDTO;

public interface IAuthenticationService {
    LoginResponseDTO login (LoginRequestDTO loginRequestDTO);
}
