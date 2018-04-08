
public class Produto {
	private int codigo;
	private String descricao;
	private double preco;

	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public void  setDescontoProduto() {
		this.preco = this.preco * 0.1;
	}

}
