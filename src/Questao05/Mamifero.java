package Questao05;

public class Mamifero extends Animal{
	public Mamifero(String nome, String grupo, String especie, boolean eQuadrupede) {
		super(nome, grupo, especie);
		this.eQuadrupede = eQuadrupede;
	}

	private boolean eQuadrupede;

	public boolean iseQuadrupede() {
		return eQuadrupede;
	}

	public void seteQuadrupede(boolean eQuadrupede) {
		this.eQuadrupede = eQuadrupede;
	}

}
