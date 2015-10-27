package br.com.cursojsf.javaee.primeirobean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrimeiroBean {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void enviar(){
		setNome(getNome().toUpperCase());
	}

}
