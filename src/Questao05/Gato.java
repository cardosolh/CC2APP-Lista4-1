package Questao05;

public class Gato extends Mamifero{
	private boolean invocaSatan;

	public Gato(String nome, String grupo, String especie, boolean eQuadrupede, boolean invocaSatan) {
		super(nome, grupo, especie, eQuadrupede);
		this.invocaSatan = invocaSatan;
	}

	public boolean isInvocaSatan() {
		return invocaSatan;
	}

	public void setInvocaSatan(boolean invocaSatan) {
		this.invocaSatan = invocaSatan;
	}

}
