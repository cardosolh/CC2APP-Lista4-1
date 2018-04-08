package Questao04;

public class Funcionario {
	private int codigoFuncionario;
	private String nome;
	private double salario;
	private double bonus;

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Funcionario(int codigo, String nome, double salario) {
		super();
		this.codigoFuncionario = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	

}
