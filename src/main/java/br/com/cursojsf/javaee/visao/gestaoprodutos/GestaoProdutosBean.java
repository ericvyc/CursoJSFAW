package br.com.cursojsf.javaee.visao.gestaoprodutos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import br.com.cursojsf.javaee.dominio.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

	private static final long serialVersionUID = -62854982190177074L;

	private Produto produto;

	private List<Produto> produtos;

	private Produto produtoSelecionado;

	private SimpleDateFormat sdf = new SimpleDateFormat();

	public void excluir(){
		getProdutos().remove(getProdutoSelecionado());
		System.out.println("Produto "+ getProdutoSelecionado().toString() +" removido com sucesso!");
	}

	public void verificarInclusao(ActionEvent event) {
		if(getProduto().getFabricante().equals("")){
			getProduto().setFabricante("Sem fabricante");
		}
		if(getProduto().getCategoria().equals("")){
			getProduto().setCategoria("Sem categoria");
		}
		if(getProduto().getNome().equals("")){
			getProduto().setNome("Sem nome");
		}
	}

	public String obterAjuda() {
		return produtos.isEmpty() ? "AjudaGestaoProdutos?faces-redirect=true"
				: "AjudaGestaoProdutosTelefone?faces-redirect=true";
	}

	@PostConstruct
	public void inicializa() {
		Date dt1 = new Date();
		System.out.println("Inicializou: " + dt1.getHours() + ":" + dt1.getMinutes() + ":" + dt1.getSeconds());
	}

	@PreDestroy
	public void finaliza() {
		Date dt1 = new Date();
		System.out.println("Terminou: " + dt1.getHours() + ":" + dt1.getMinutes() + ":" + dt1.getSeconds());
	}

	public void incluir() {
		getProdutos().add(getProduto());
		setProduto(new Produto());
	}

	public GestaoProdutosBean() {
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

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

}
