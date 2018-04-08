package Questao11;

public class Ultrabook extends Computador {

	@Override
	public void informaCaracteristicas(String cor) {
		this.cor = "branco";

	}

	@Override
	public void informaCaracteristicas(int tamanho) {
		this.tamanho = 16;

	}

	@Override
	public void informaCaracteristicas(String cor, int tamanho) {
		this.cor = "branco";
		this.tamanho = 16;


	}

}
