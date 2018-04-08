package Questao07;

public class Hidraulico extends Equipamento {
	private String material;

	public Hidraulico(int preco, String nome, String fabricante, String material) {
		super(preco, nome, fabricante);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
