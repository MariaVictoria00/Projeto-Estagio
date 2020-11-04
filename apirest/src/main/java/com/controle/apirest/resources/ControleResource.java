package com.controle.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.apirest.models.Controle;
import com.controle.apirest.repository.ControleRepository;

//requisicoes do http
@RestController
@RequestMapping(value="/api")
public class ControleResource {
	
	//criar ponto de injecao para utilizar o metodo e conectar com o bd
	@Autowired
	ControleRepository controleRepository;
	
	//listar os estagiarios
	@GetMapping("/estagiarios")
	public List<Controle> listaEstagiarios(){
		return controleRepository.findAll();
	}
	//listar um estagiario especifico
	@GetMapping("/estagiarios/{id}")
	public Controle listaEstagiariosUnico(@PathVariable(value="id") long id){
		return controleRepository.findById(id);
	}
	
	//criar metodo post para salvar um determinado produto
	@PostMapping("/estagiario")
	public Controle salvarEstagiario(@RequestBody Controle controle) {
		return controleRepository.save(controle);
	}
	
	
	//criar metodo delete para deletar um determinado produto
	@DeleteMapping("/estagiario")
	public void atualizaEstagiario(@RequestBody Controle controle) {
		controleRepository.delete(controle);
	}
	//criar metodo put para atualizar um determinado produto
		@PutMapping("/estagiario")
		public Controle deletaEstagiario(@RequestBody Controle controle) {
			return controleRepository.save(controle);
		}
	
	
	

}
