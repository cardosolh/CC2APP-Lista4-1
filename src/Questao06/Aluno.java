package Questao06;

public class Aluno extends Pessoa{
	public Aluno(String nome, int matricula, String turma) {
		super(nome, matricula);
		this.turma = turma;
	}

	private String turma;

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
