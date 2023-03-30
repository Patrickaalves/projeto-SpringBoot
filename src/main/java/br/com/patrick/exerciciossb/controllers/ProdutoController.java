package br.com.patrick.exerciciossb.controllers;

import br.com.patrick.exerciciossb.model.entities.Produto;
import br.com.patrick.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina){


        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutosId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    @PutMapping
    public Produto alterraProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    /*
    * Para usar a mesma função para o post e put
    * @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})*/

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
