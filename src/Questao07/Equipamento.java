package Questao07;

public class Equipamento {
	private int preco;
	private String nome;
	private String fabricante;
	public Equipamento(int preco, String nome, String fabricante) {
		super();
		this.preco = preco;
		this.nome = nome;
		this.fabricante = fabricante;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
