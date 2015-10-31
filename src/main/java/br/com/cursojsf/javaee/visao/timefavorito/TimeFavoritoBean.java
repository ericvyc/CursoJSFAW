package br.com.cursojsf.javaee.visao.timefavorito;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeFavoritoBean implements Serializable {

	private static final long serialVersionUID = -9211740698997811660L;

	private String time;

	public void escolher() {
		System.out.println("Time selecionado: " + getTime());
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
