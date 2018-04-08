package Questao06;

import java.time.LocalDateTime;

public class Diretor extends Pessoa{
	private LocalDateTime inicioGestao;

	public Diretor(String nome, int matricula, LocalDateTime inicioGestao) {
		super(nome, matricula);
		this.inicioGestao = inicioGestao;
	}

	public LocalDateTime getInicioGestao() {
		return inicioGestao;
	}

	public void setInicioGestao(LocalDateTime inicioGestao) {
		this.inicioGestao = inicioGestao;
	}

}
