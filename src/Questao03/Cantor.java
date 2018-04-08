package Questao03;

public class Cantor extends Artista{
	private String tipoVoz;

	public Cantor(String nome, String escolaridade, String especialidade, String tipoVoz) {
		super(nome, escolaridade, especialidade);
		this.tipoVoz = tipoVoz;
	}

	public String getTipoVoz() {
		return tipoVoz;
	}

	public void setTipoVoz(String tipoVoz) {
		this.tipoVoz = tipoVoz;
	}
	
	
	

}
