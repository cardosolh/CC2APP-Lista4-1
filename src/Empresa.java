
public class Empresa {
	private String CNPJ;
	private String nome;
	private String telefone;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa(String cNPJ, String nome, String telefone) {
		super();
		CNPJ = cNPJ;
		this.nome = nome;
		this.telefone = telefone;
	}

}
