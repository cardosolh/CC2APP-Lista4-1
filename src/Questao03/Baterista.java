package Questao03;

public class Baterista  extends Artista{
	private String instrumento;

	public Baterista(String nome, String escolaridade, String especialidade, String instrumento) {
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
