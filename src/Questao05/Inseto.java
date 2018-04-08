package Questao05;

public class Inseto extends Animal{
	private int qntdMembros;
	private boolean asas;
	public int getQntdMembros() {
		return qntdMembros;
	}
	public void setQntdMembros(int qntdMembros) {
		this.qntdMembros = qntdMembros;
	}
	public boolean isAsas() {
		return asas;
	}
	public void setAsas(boolean asas) {
		this.asas = asas;
	}
	public Inseto(String nome, String grupo, String especie, int qntdMembros, boolean asas) {
		super(nome, grupo, especie);
		this.qntdMembros = qntdMembros;
		this.asas = asas;
	}

}
