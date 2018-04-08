package Questao06;

public class ProfessorEP extends Professor{
	private String turma;

	public ProfessorEP(String nome, int matricula, String origemDouturado, String turma) {
		super(nome, matricula, origemDouturado);
		this.turma = turma;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
