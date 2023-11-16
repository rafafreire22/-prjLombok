package com.Rafaellafreire.projeto.Lombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rafaellafreire.projeto.Lombok.etities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	

}
