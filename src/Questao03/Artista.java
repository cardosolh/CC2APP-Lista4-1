package Questao03;

public class Artista {
	private String nome;
	private String escolaridade;
	private String especialidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Artista(String nome, String escolaridade, String especialidade) {
		super();
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.especialidade = especialidade;
	}

}
