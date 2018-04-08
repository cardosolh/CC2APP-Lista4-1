package Questao04;

public class Advogado extends Funcionario{
	private String regOAB;

	public Advogado(int codigo, String nome, double salario, String regOAB) {
		super(codigo, nome, salario);
		this.regOAB = regOAB;
	}

	public String getRegOAB() {
		return regOAB;
	}

	public void setRegOAB(String regOAB) {
		this.regOAB = regOAB;
	}

}
