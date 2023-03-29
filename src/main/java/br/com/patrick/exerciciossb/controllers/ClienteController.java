package br.com.patrick.exerciciossb.controllers;

import br.com.patrick.exerciciossb.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123.456.789-00");
        // Retorna um json
        /*
        * {"id":28,"nome":"Pedro","cpf":"123.456.789-00"}
        * */
    }
    //@GetMapping() Se não preencher com nada ele assume a pai, no caso /clientes
//    public String ola(){
//        return "ola";
//    }
}
