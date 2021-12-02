package com.ninas_market.ninas_market.controller;

import java.util.List;

import com.ninas_market.ninas_market.model.Produto;
import com.ninas_market.ninas_market.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    

    @Autowired
    public ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping
    public Produto atualizar(@RequestBody Produto produto) {
        return produtoRepository.saveAndFlush(produto);
    }

    @DeleteMapping
    public void deletar(@RequestBody Produto produto) {
        produtoRepository.deleteById(produto.getId());
    }
}
