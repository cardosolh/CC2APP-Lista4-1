package Questao05;

public class Formiga extends Inseto{
	public Formiga(String nome, String grupo, String especie, int qntdMembros, boolean asas, boolean rainha) {
		super(nome, grupo, especie, qntdMembros, asas);
		this.rainha = rainha;
	}

	private boolean rainha;

	public boolean isRainha() {
		return rainha;
	}

	public void setRainha(boolean rainha) {
		this.rainha = rainha;
	}

}
