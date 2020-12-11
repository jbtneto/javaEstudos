package br.neto.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica classe controller do tipo REST
@CrossOrigin("*") //  Aceita pedidos de qualquer origem
@RequestMapping("/start")
public class Hello {

    @GetMapping("/hello") //metodo GET com uri '/hello'
    public String hello(){
        return "Hello World";
    }
}
