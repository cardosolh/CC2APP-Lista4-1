package Questao07;

public class Eletrodomestico extends Equipamento{
	public String seloConsumoAneel;

	public Eletrodomestico(int preco, String nome, String fabricante, String seloConsumoAneel) {
		super(preco, nome, fabricante);
		this.seloConsumoAneel = seloConsumoAneel;
	}

	public String getSeloConsumoAneel() {
		return seloConsumoAneel;
	}

	public void setSeloConsumoAneel(String seloConsumoAneel) {
		this.seloConsumoAneel = seloConsumoAneel;
	}

}
