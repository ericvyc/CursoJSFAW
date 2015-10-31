package br.com.cursojsf.javaee.visao.cadastrocurriculo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroCurriculoBean implements Serializable {

	private static final long serialVersionUID = 8906951687456749954L;

	private String vaga = "A0382D";

	private String cargo = "Programador Java Senior";

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
