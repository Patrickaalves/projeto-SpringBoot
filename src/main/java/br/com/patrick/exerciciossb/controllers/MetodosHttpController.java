package br.com.patrick.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "requisição get";
    }
    @PostMapping
    public String post(){
        return "requisicao post";
    }
    @PutMapping
    public String put(){
        return "requisição put";
    }
    @DeleteMapping
    public String delete(){
        return "requisição delete";
    }
}
