package com.controle.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.apirest.models.Controle;

public interface ControleRepository extends JpaRepository< Controle, Long> {
	
	//personalizar para listar apenas um estagiario especifico
	Controle findById(long id);
	

}
