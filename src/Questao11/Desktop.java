package Questao11;

public class Desktop extends Computador {

	@Override
	public void informaCaracteristicas(String cor) {
		this.cor = "preto";

	}

	@Override
	public void informaCaracteristicas(int tamanho) {
		this.tamanho = 23;

	}

	@Override
	public void informaCaracteristicas(String cor, int tamanho) {
		this.cor = "preto";
		this.tamanho = 23;


	}

}
