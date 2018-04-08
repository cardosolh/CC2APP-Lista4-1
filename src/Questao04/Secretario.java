package Questao04;

public class Secretario extends Funcionario{
	private String diretorImediato;

	public Secretario(int codigo, String nome, double salario, String diretorImediato) {
		super(codigo, nome, salario);
		this.diretorImediato = diretorImediato;
	}

	public String getDiretorImediato() {
		return diretorImediato;
	}

	public void setDiretorImediato(String diretorImediato) {
		this.diretorImediato = diretorImediato;
	}

}
