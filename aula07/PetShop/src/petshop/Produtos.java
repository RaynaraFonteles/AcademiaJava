package petshop;
import java.util.List;

public class Produtos {

	// variáveis 
	private String nome;
	private String categoria;
	private double preco;
	private int quantidadeEstoque;

	
	// percorre a lista e verifica se tem o produto com o nome quero comprar
	public void vender(List<Produtos> produtos, String nome, int quantidadeAdquirida) {
		Produtos produto = new Produtos();
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(nome)) {
				produto = produtos.get(i);
			}
		}
		
		// método que verifica a quantidade em estoque, realiza a venda e remove o produto vendido
		if (produto.getQuantidadeEstoque() > 0 && produto.getQuantidadeEstoque() > quantidadeAdquirida) {
			produtos.remove(produto);
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
			produtos.add(produto);
			System.out.println("Venda realizada com sucesso!");
		} else {
			System.out.println("Não há disponível no estoque!");
		}
	}

	// construtor
	public Produtos() {
	}

	// construtor com parâmetros
	public Produtos(String nome, String categoria, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	
	// método para toString 
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", quantidadeEstoque="
				+ quantidadeEstoque + "]";
	}

}