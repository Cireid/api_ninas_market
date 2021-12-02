package com.ninas_market.ninas_market.controller;

import java.util.List;

import com.ninas_market.ninas_market.model.Usuario;
import com.ninas_market.ninas_market.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class UsuarioController {
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    @GetMapping

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return usuarioRepository.saveAndFlush(usuario);
    }

    @DeleteMapping
    public void deletar(@RequestBody Usuario usuario) {
        usuarioRepository.deleteById(usuario.getId());
    }
}
