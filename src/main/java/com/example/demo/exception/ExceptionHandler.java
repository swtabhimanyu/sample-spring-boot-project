package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> notFound(IllegalAccessException ex){
        System.out.println("abhimanu");
        return new ResponseEntity<>("Abhimanyu Throwed exeption",HttpStatus.OK);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public String exception(){
        return "error in code";
    }
}
