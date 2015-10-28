package br.com.cursojsf.javaee.visao.gestaoprodutos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.cursojsf.javaee.dominio.Produto;

@ManagedBean
@RequestScoped
public class GestaoProdutosBean implements Serializable{

	private static final long serialVersionUID = -62854982190177074L;

	private Produto produto;

	private List<Produto> produtos;

	private SimpleDateFormat sdf = new SimpleDateFormat();

	@PostConstruct
	public void inicializa(){
		Date dt1 = new Date();
		System.out.println("Inicializou: " + dt1.getHours() + ":" + dt1.getMinutes() + ":" + dt1.getSeconds());
	}

	@PreDestroy
	public void finaliza(){
		Date dt1 = new Date();
		System.out.println("Terminou: " + dt1.getHours() + ":" + dt1.getMinutes() + ":" + dt1.getSeconds());
	}

	public void incluir(){
		getProdutos().add(getProduto());
		setProduto(new Produto());
	}

	public GestaoProdutosBean(){
		setProdutos(new ArrayList<Produto>());
		setProduto(new Produto());
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
