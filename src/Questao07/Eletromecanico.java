package Questao07;

public class Eletromecanico extends Equipamento {
	private double tensaoNecessaria;

	public Eletromecanico(int preco, String nome, String fabricante, double tensaoNecessaria) {
		super(preco, nome, fabricante);
		this.tensaoNecessaria = tensaoNecessaria;
	}

	public double getTensaoNecessaria() {
		return tensaoNecessaria;
	}

	public void setTensaoNecessaria(double tensaoNecessaria) {
		this.tensaoNecessaria = tensaoNecessaria;
	}

}
