package Questao05;

public class Animal {
	private String nome;
	private String grupo;
	private String especie;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Animal(String nome, String grupo, String especie) {
		super();
		this.nome = nome;
		this.grupo = grupo;
		this.especie = especie;
	}

}
