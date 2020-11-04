package com.controle.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TABELA_ESTAGIARIOS")
public class Controle implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String nome;
    private String telefone;
    private String email;
    private String foto;
    private String comprovanteDeMatricula;
    private String areasDeInteresse;
    private String areasDeDominio;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getComprovanteDeMatricula() {
		return comprovanteDeMatricula;
	}
	public void setComprovanteDeMatricula(String comprovanteDeMatricula) {
		this.comprovanteDeMatricula = comprovanteDeMatricula;
	}
	public String getAreasDeInteresse() {
		return areasDeInteresse;
	}
	public void setAreasDeInteresse(String areasDeInteresse) {
		this.areasDeInteresse = areasDeInteresse;
	}
	public String getAreasDeDominio() {
		return areasDeDominio;
	}
	public void setAreasDeDominio(String areasDeDominio) {
		this.areasDeDominio = areasDeDominio;
	}
    

}


