package Questao07;

public class TV extends Eletrodomestico{
	private String resolucaoMaxima;

	public TV(int preco, String nome, String fabricante, String seloConsumoAneel, String resolucaoMaxima) {
		super(preco, nome, fabricante, seloConsumoAneel);
		this.resolucaoMaxima = resolucaoMaxima;
	}

	public String getResolucaoMaxima() {
		return resolucaoMaxima;
	}

	public void setResolucaoMaxima(String resolucaoMaxima) {
		this.resolucaoMaxima = resolucaoMaxima;
	}

}
