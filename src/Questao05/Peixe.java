package Questao05;

public class Peixe extends Animal{
	public Peixe(String nome, String grupo, String especie, boolean aguaDoce) {
		super(nome, grupo, especie);
		this.aguaDoce = aguaDoce;
	}

	private boolean aguaDoce;

	public boolean isAguaDoce() {
		return aguaDoce;
	}

	public void setAguaDoce(boolean aguaDoce) {
		this.aguaDoce = aguaDoce;
	}

}
