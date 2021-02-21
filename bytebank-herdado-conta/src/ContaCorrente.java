
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		//super();  chama o construtor PADRÃO da classe mãe, porém é implícito
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
