public class Conta2{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular; // = new Cliente() já cria um novo cliente automaticamente
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta2 destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
}
	