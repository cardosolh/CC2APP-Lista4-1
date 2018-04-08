package Questao07;

public class Motor extends Eletromecanico {
	private double cavalosPotencia;

	public Motor(int preco, String nome, String fabricante, double tensaoNecessaria, double cavalosPotencia) {
		super(preco, nome, fabricante, tensaoNecessaria);
		this.cavalosPotencia = cavalosPotencia;
	}

	public double getCavalosPotencia() {
		return cavalosPotencia;
	}

	public void setCavalosPotencia(double cavalosPotencia) {
		this.cavalosPotencia = cavalosPotencia;
	}

}
