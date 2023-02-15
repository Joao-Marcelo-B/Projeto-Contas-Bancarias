
public class ContaCorrente extends ContaBancaria{
	
	
	public ContaCorrente(Titular titular, String numeroConta, String numeroAgencia, double saldo, boolean status) {
		super(titular, numeroConta, numeroAgencia, saldo, status);
	}

	public final void pagarMensalidade() {
		
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir() {
		// TODO Auto-generated method stub
		
	}
}
