package br.com.cursojsf.javaee.visao.timefavorito;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimesFavoritosBean implements Serializable {

	private static final long serialVersionUID = 2547727636470486962L;

	private List<String> times;

	public void escolher() {
		System.out.println("Times selecionados: ");
		for(String time : getTimes()){
			System.out.println(time);
		}
	}

	public List<String> getTimes() {
		return times;
	}

	public void setTimes(List<String> times) {
		this.times = times;
	}

}
