package br.com.patrick.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    @GetMapping(path = "somar")
    public double somar(@RequestParam(name = "n1") double num1, @RequestParam(name = "n2") double num2){
        return num1 + num2;
    }

    @GetMapping(path = "subtrair")
    public double subtrair(@RequestParam(name = "n1") double num1, @RequestParam(name = "n2") double num2){
        return num1 - num2;
    }

    @GetMapping(path = "multiplicar")
    public double multiplicar(@RequestParam(name = "n1") double num1, @RequestParam(name = "n2") double num2){
        return num1 * num2;
    }

    @GetMapping(path = "dividir")
    public double dividir(@RequestParam(name = "n1") double num1, @RequestParam(name = "n2") double num2){
        return num1 / num2;
    }
}
