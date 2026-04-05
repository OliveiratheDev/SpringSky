package com.openApi.dev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<String > handleNotFound(HttpClientErrorException.NotFound ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cidade não encontrada no sistema");
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralError(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor " + ex.getMessage());
    }
}
