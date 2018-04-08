package Questao05;

public class Ave extends Animal{
	public Ave(String nome, String grupo, String especie, double envergaduraAsa) {
		super(nome, grupo, especie);
		this.envergaduraAsa = envergaduraAsa;
	}

	public double getEnvergaduraAsa() {
		return envergaduraAsa;
	}

	public void setEnvergaduraAsa(double envergaduraAsa) {
		this.envergaduraAsa = envergaduraAsa;
	}

	private double envergaduraAsa;

}
