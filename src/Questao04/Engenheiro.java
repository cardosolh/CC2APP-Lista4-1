package Questao04;

public class Engenheiro extends Funcionario{
	private String regCREA;

	public Engenheiro(int codigo, String nome, double salario, String regCREA) {
		super(codigo, nome, salario);
		this.regCREA = regCREA;
	}

	public String getRegCREA() {
		return regCREA;
	}

	public void setRegCREA(String regCREA) {
		this.regCREA = regCREA;
	}

}
