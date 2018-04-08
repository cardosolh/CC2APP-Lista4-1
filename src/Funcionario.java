
public class Funcionario {
	private int codigoFuncionario;
	private String nome;
	private double salario;
	private int countbonus;

	public Funcionario(int codigo, String nome, double salario) {
		super();
		this.codigoFuncionario = codigo;
		this.nome = nome;
		this.salario = salario;
		this.countbonus = 0;
	}
	
	private void bonificação() {
		this.salario= this.salario+ this.salario*0.05;
	}

	public double getSalario() {
		return salario;
	}
	
	public void realizaVenda() {
		countbonus++;
		if (countbonus==10) {
			this.bonificação();
			this.countbonus=0;
		}
			
	}

}
