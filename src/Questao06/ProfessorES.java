package Questao06;

public class ProfessorES extends Professor{
	private String projetos;

	public String getProjetos() {
		return projetos;
	}

	public void setProjetos(String projetos) {
		this.projetos = projetos;
	}

	public ProfessorES(String nome, int matricula, String origemDouturado, String projetos) {
		super(nome, matricula, origemDouturado);
		this.projetos = projetos;
	}
	

}
