package Questao06;

public class alunoEP extends Aluno{
	private double notaMedia;

	public alunoEP(String nome, int matricula, String turma, double notaMedia) {
		super(nome, matricula, turma);
		this.notaMedia = notaMedia;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

}
