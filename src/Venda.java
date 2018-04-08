import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
	private Funcionario vendedor;
	private Cliente consumidor;
	private ArrayList<Produto> carrinhoCompras;
	private int codigoVenda;
	private double valorTotal;
	private LocalDateTime data;

	public Venda(Funcionario vendedor, Cliente consumidor, int codigoVenda) {
		super();
		this.vendedor = vendedor;
		this.consumidor = consumidor;
		this.carrinhoCompras = new ArrayList<Produto>();
		this.codigoVenda = codigoVenda;
		this.valorTotal = 0;
		this.data = LocalDateTime.now();
	}

	public void addProduto(Produto x) {
		if (!this.verifCarrinhoCheio()) {
			this.carrinhoCompras.add(x);
			this.valorTotal = this.valorTotal +x.getPreco();
			this.consumidor.removeDinheiro(x.getPreco());
		} else
			System.out.println("Carrinho de Compras Cheio");
	}

	public void removeProduto(int x) {
		if (this.verifProduto(x) != null) {
			this.valorTotal = this.valorTotal - this.verifProduto(x).getPreco();
			this.carrinhoCompras.remove(this.verifProduto(x));
		} else
			System.out.println("Produto não Encontrado");
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public Produto verifProduto(int x) {

		for (Produto prod : this.carrinhoCompras)
			if (prod.getPreco() == x)
				return prod;
		return null;
	}

	public boolean verifCarrinhoCheio() {
		return (this.carrinhoCompras.size() > 4);

	}

}
