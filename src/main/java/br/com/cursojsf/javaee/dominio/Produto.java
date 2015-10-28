package br.com.cursojsf.javaee.dominio;

import java.io.Serializable;

public class Produto implements Serializable{

	private static final long serialVersionUID = 2432731572491505950L;

	private String nome;

	private String fabricante;

	private String categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabricante=" + fabricante + ", categoria=" + categoria + "]";
	}

}
