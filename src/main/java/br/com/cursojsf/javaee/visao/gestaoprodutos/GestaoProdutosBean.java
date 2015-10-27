package br.com.cursojsf.javaee.visao.gestaoprodutos;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cursojsf.javaee.dominio.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutosBean {

	private Produto produto;

	private List<Produto> produtos;

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
