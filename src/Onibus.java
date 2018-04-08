
public class Onibus {
	private Empresa empresa;
	private int codigo;
	private double kmRodados;
	private int qntdPessoas;
	private String nomeMotorista;

	public Onibus(Empresa empresa, int codigo, String nomeMotorista) {
		super();
		this.empresa = empresa;
		this.codigo = codigo;
		this.kmRodados = 0;
		this.qntdPessoas = 0;
		this.nomeMotorista = nomeMotorista;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		if (this.verifAptoRodagem(kmRodados))
			this.kmRodados = kmRodados;
		this.reciboAptoRodagem(kmRodados);
	}

	public int getQntdPessoas() {
		return qntdPessoas;
	}

	public void addPessoas(int qntdPessoas) {
		if (qntdPessoas > 0 && qntdPessoas + this.getQntdPessoas() < 61)
			this.qntdPessoas = +qntdPessoas;
		else
			System.out.printf("\nQuantidade inválida de pessoas");
	}

	public void removePessoas() {
		if (this.getQntdPessoas() > 0)
			this.qntdPessoas--;
		else
			System.out.printf("\nQuantidade inválida de pessoas");
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public boolean verifAptoRodagem(double kms) {
		return this.getKmRodados()+kms <= 200;
	}

	public void reciboAptoRodagem(double kms) {
		if (verifAptoRodagem(kms))
			System.out.printf("\nÔnibus pode continuar rodando");
		else
			System.out.printf("\nÔnibus não pode continuar rodando");
	}

}
