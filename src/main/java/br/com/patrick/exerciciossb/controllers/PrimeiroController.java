package br.com.patrick.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {
    @RequestMapping(method = RequestMethod.GET, path = "/ola")
    // @RequestMapping(method = RequestMethod.GET, path = {"/ola", "/ola2"}) Ser chamado em mais de um lugar
    //@GetMapping("ola") Pode ussar assim tambem
    public String ola (){
        return "Ola Spring boot";
    }

    //@RequestMapping(method = RequestMethod.GET, path = "/ola") Não posso apontar outro metodo para o caminho ola
    // Se não ira dar erro
    public String saudaco (){
        return "Ola Spring boot";
    }

    @PostMapping(path = "/ola")
    public String sau (){
        return "Ola Spring boot POST";
    }

}
