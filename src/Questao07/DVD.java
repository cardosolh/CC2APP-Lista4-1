package Questao07;

public class DVD extends Eletrodomestico{
	private String regiãoLida;

	public DVD(int preco, String nome, String fabricante, String seloConsumoAneel, String regiãoLida) {
		super(preco, nome, fabricante, seloConsumoAneel);
		this.regiãoLida = regiãoLida;
	}

	public String getRegiãoLida() {
		return regiãoLida;
	}

	public void setRegiãoLida(String regiãoLida) {
		this.regiãoLida = regiãoLida;
	}
}
