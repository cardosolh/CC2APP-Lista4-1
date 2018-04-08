
public class Produto {
	private int codigoProduto;
	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	private String descricao;
	private double preco;

	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigoProduto = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public void  setDescontoProduto() {
		this.preco = this.preco * 0.9;
	}

}
