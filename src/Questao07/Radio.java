package Questao07;

public class Radio extends Eletrodomestico {
	public Radio(int preco, String nome, String fabricante, String seloConsumoAneel, double potencia) {
		super(preco, nome, fabricante, seloConsumoAneel);
		this.potencia = potencia;
	}

	private double potencia;

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
}
