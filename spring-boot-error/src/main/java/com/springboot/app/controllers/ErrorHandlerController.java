package com.springboot.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(ArithmeticException.class)
    public String arimeticaError(Exception ex, Model model) {
        model.addAttribute("error", "Error aritmetica");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        return "error/aritmetica";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatError(Exception ex, Model model) {
        model.addAttribute("error", "Formato de numero invalido");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/numero-formato";
    }
}
