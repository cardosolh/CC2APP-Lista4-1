package Questao04;

public class Gerente extends Funcionario{
	public Gerente(int codigo, String nome, double salario, Diretor diretor) {
		super(codigo, nome, salario);
		this.diretor = diretor;
	}

	private Diretor diretor;

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	

}
