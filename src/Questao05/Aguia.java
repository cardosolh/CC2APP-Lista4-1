package Questao05;

public class Aguia extends Passaro{
	private double forcaBico;

	public Aguia(String nome, String grupo, String especie, double envergaduraAsa, double altitudeAlcancada,
			double forcaBico) {
		super(nome, grupo, especie, envergaduraAsa, altitudeAlcancada);
		this.forcaBico = forcaBico;
	}

	public double getForcaBico() {
		return forcaBico;
	}

	public void setForcaBico(double forcaBico) {
		this.forcaBico = forcaBico;
	}

}
