package br.com.patrick.exerciciossb.model.repositories;

import br.com.patrick.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {
}
