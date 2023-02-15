
public class ContaCorrente extends ContaBancaria{
	
	
	public ContaCorrente(Titular titular, String numeroConta) {
		
		super(titular, numeroConta, "3104", 200, true);
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
