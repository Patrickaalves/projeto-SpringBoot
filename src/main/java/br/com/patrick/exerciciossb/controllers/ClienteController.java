package br.com.patrick.exerciciossb.controllers;

import br.com.patrick.exerciciossb.model.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123.456.789-00");
    }
    @GetMapping("/{id}") // Pode ser modificado
    public Cliente obterClientePorId(@PathVariable int id){
        return new Cliente(id, "Maria","987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "0", required = false) int id,
                                      @RequestParam(name = "cpf") String cpf){
        if (cpf.isEmpty()){
            return new Cliente(id, "joao","123.456.789.00");
        }else {
            return new Cliente(id, "joao",cpf);
        }

    }
}
