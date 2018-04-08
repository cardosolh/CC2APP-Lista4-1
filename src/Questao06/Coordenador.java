package Questao06;

public class Coordenador extends Professor{
	private String instituto;

	public Coordenador(String nome, int matricula, String origemDouturado, String instituto) {
		super(nome, matricula, origemDouturado);
		this.instituto = instituto;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

}
