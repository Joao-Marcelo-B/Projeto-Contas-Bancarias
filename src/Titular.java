
public class Titular {
	private String nome, cpf, telefone, nascimento;
	
	public Titular(String nome, String cpf, String telefone, String nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Titular [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", nascimento=" + nascimento + "]";
	}
	
}
