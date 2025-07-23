package com.ronal.educlass.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<ErrorDTO> businessException(BusinessException ex) {
        ErrorDTO error = ErrorDTO.builder()
                .codigo(ex.getCodigo())
                .mensaje(ex.getMessage())
                .build();
        return new ResponseEntity<>(error, ex.getEstado());

    }
}
