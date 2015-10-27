package br.com.cursojsf.javaee.backingbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;

@ManagedBean
@RequestScoped
public class BackingBean {

	private HtmlOutputText texto;

	private HtmlInputText campo;

	private HtmlCommandButton botao;

	public void testar(){

		if(getCampo().isDisabled()){
			restaurarView();
		} else {
			mudaView();
		}

	}

	private void mudaView() {
		getCampo().setDisabled(true);
		getTexto().setValue(getTexto().getValue().toString().toUpperCase());
		getBotao().setStyle("background-color: blue; color: white");
	}

	private void restaurarView() {
		getBotao().setStyle(null);
		getCampo().setDisabled(false);
		getTexto().setValue("Seu nome:");
	}

	public HtmlInputText getCampo() {
		return campo;
	}

	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}

	public HtmlCommandButton getBotao() {
		return botao;
	}

	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}

	public HtmlOutputText getTexto() {
		return texto;
	}

	public void setTexto(HtmlOutputText texto) {
		this.texto = texto;
	}

}
