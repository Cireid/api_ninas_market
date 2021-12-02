package com.ninas_market.ninas_market.repository;

import com.ninas_market.ninas_market.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario ,Long>  {
    
}
