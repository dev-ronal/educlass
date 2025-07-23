package com.ronal.educlass.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
public class BusinessException extends Exception{
    private HttpStatus estado;
    private String codigo;

    public BusinessException(String codigo, HttpStatus estado, String message){
        super(message);
        this.codigo = codigo;
        this.estado = estado;
    }
}
