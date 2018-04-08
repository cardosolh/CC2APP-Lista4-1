package Questao05;

public class Reptil extends Animal{
	public Reptil(String nome, String grupo, String especie, String rigidezPele) {
		super(nome, grupo, especie);
		this.rigidezPele = rigidezPele;
	}

	public String getRigidezPele() {
		return rigidezPele;
	}

	public void setRigidezPele(String rigidezPele) {
		this.rigidezPele = rigidezPele;
	}

	private String rigidezPele;

}
