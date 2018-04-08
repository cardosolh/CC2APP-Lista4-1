package Questao05;

public class Passaro extends Ave{
	private double altitudeAlcancada;

	public Passaro(String nome, String grupo, String especie, double envergaduraAsa, double altitudeAlcancada) {
		super(nome, grupo, especie, envergaduraAsa);
		this.altitudeAlcancada = altitudeAlcancada;
	}

	public double getAltitudeAlcancada() {
		return altitudeAlcancada;
	}

	public void setAltitudeAlcancada(double altitudeAlcancada) {
		this.altitudeAlcancada = altitudeAlcancada;
	}

}
