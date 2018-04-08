package Questao05;

public class Lobo extends Mamifero{
	private String matilha;

	public Lobo(String nome, String grupo, String especie, boolean eQuadrupede, String matilha) {
		super(nome, grupo, especie, eQuadrupede);
		this.matilha = matilha;
	}

	public String getMatilha() {
		return matilha;
	}

	public void setMatilha(String matilha) {
		this.matilha = matilha;
	}

}
