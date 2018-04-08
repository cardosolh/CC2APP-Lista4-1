package Questao11;

public class Notebook extends Computador {

	@Override
	public void informaCaracteristicas(String cor) {
		this.cor = "cinza";

	}

	@Override
	public void informaCaracteristicas(int tamanho) {
		this.tamanho = 13;

	}

	@Override
	public void informaCaracteristicas(String cor, int tamanho) {
		this.cor = "cinza";
		this.tamanho = 13;

	}

}
