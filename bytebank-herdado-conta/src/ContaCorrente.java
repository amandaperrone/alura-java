
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		//super();  chama o construtor PADR�O da classe m�e, por�m � impl�cito
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + 0.2;
		return super.saca(valorSaque);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
}
