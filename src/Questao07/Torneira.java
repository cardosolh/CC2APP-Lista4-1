package Questao07;

public class Torneira extends Hidraulico {
	private double vazaoMaxima;

	public double getVazaoMaxima() {
		return vazaoMaxima;
	}

	public void setVazaoMaxima(double vazaoMaxima) {
		this.vazaoMaxima = vazaoMaxima;
	}

	public Torneira(int preco, String nome, String fabricante, String material, double vazaoMaxima) {
		super(preco, nome, fabricante, material);
		this.vazaoMaxima = vazaoMaxima;
	}
	

}
