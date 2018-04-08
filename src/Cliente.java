
public class Cliente {
	private String nome;
	private String telefone;
	private String CPF;
	private double dinheiroDisp;
	private Empresa loja;

	public Cliente(String nome, String telefone, String cPF, double dinheiroDisp, Empresa loja) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		CPF = cPF;
		this.dinheiroDisp = dinheiroDisp;
		this.loja = loja;
	}

	public double getDinheiroDisp() {
		return dinheiroDisp;
	}

	public void removeDinheiro(double dinheiro) {
		this.dinheiroDisp = this.dinheiroDisp -dinheiro;
	}

}
