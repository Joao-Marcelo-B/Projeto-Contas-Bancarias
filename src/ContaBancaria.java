
public abstract class ContaBancaria {
	protected Titular titular;
	protected String numeroConta;
	protected String numeroAgencia;
	protected double saldo;
	protected boolean status;
	
	public abstract void sacar();
	public abstract void transferir();
	public final void depositar(double valorDeposito) {
		if(this.status) {
			this.saldo = valorDeposito;
		}
	}
	
	
	public ContaBancaria(Titular titular, String numeroConta, String numeroAgencia, double saldo, boolean status) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.status = status;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContaBancaria" 
				+ "\nNome do titular: " + titular.getNome() 
				+ "\nCpf do titular: " + titular.getCpf()
				+ "\nTelefone do titular: " + titular.getTelefone()
				+ "\nData de nascimento: " + titular.getNascimento()
				+ "\nNumero da conta: " + numeroConta
				+ "\nNumero da agencia: " + numeroAgencia
				+ "\nSaldo da conta: " + saldo 
				+ "\nStatus: " + status;
	}
	
}	
