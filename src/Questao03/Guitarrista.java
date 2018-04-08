package Questao03;

public class Guitarrista  extends Artista{
	private String instrumento;

	public Guitarrista(String nome, String escolaridade, String especialidade, String instrumento) {
		super(nome, escolaridade, especialidade);
		this.instrumento = instrumento;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

}
