package Questao07;

public class DVD extends Eletrodomestico{
	private String regi�oLida;

	public DVD(int preco, String nome, String fabricante, String seloConsumoAneel, String regi�oLida) {
		super(preco, nome, fabricante, seloConsumoAneel);
		this.regi�oLida = regi�oLida;
	}

	public String getRegi�oLida() {
		return regi�oLida;
	}

	public void setRegi�oLida(String regi�oLida) {
		this.regi�oLida = regi�oLida;
	}
}
