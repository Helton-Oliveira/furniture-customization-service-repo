package com.digisphere.FurnitureCustomizationService.infra.errorHandler;

import com.digisphere.FurnitureCustomizationService.infra.errorHandler.templateException.TemplateException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class BaseErrorsHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleError400(MethodArgumentNotValidException e) {
        var errors = e.getFieldErrors();
        return ResponseEntity.badRequest().body(errors.stream().map(ArgumentDataException::new));
    }

    @ExceptionHandler(CustomError.class)
    public ResponseEntity<?> customError(CustomError e) {
        if(e.getMessage().equalsIgnoreCase("not found")) return ResponseEntity.notFound().build();
        return TemplateException.executeBadRequestException(e);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return TemplateException.executeBadRequestException(e);
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(SQLIntegrityConstraintViolationException e) {
        return TemplateException.executeBadRequestException(e);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleDataIntegrityViolation(DataIntegrityViolationException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<?> handleHttpRequestMethodNotSupported() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("HTTP method not supported.");
    }

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<?> sqlErrorHandler() {
        return ResponseEntity.internalServerError().body("Something went wrong while processing your request. Please try again later.");
    }
}
