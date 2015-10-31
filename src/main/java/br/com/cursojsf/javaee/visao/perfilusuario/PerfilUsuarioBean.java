package br.com.cursojsf.javaee.visao.perfilusuario;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = -1465577421089392598L;

	private String sexo;

	private boolean receberNovidades;

	private List<String> linguagensFavoritas;

	public boolean isReceberNovidades() {
		return receberNovidades;
	}

	public void setReceberNovidades(boolean receberNovidades) {
		this.receberNovidades = receberNovidades;
	}

	public String enviar() {
		return "Confirmacao";
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<String> getLinguagensFavoritas() {
		return linguagensFavoritas;
	}

	public void setLinguagensFavoritas(List<String> linguagensFavoritas) {
		this.linguagensFavoritas = linguagensFavoritas;
	}

}
