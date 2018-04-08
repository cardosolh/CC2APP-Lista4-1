package Questao05;

public class Crocodilo extends Reptil{
	private int qntdDentes;

	public Crocodilo(String nome, String grupo, String especie, String rigidezPele, int qntdDentes) {
		super(nome, grupo, especie, rigidezPele);
		this.qntdDentes = qntdDentes;
	}

	public int getQntdDentes() {
		return qntdDentes;
	}

	public void setQntdDentes(int qntdDentes) {
		this.qntdDentes = qntdDentes;
	}

}
