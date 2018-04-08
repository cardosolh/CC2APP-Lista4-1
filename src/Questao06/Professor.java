package Questao06;

public class Professor extends Pessoa{
	private String origemDouturado;

	public Professor(String nome, int matricula, String origemDouturado) {
		super(nome, matricula);
		this.origemDouturado = origemDouturado;
	}

	public String getOrigemDouturado() {
		return origemDouturado;
	}

	public void setOrigemDouturado(String origemDouturado) {
		this.origemDouturado = origemDouturado;
	}

}
