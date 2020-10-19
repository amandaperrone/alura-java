public class Conta2{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // = new Cliente() j� cria um novo cliente automaticamente
	// static � DA classe
	private static int total;
	
	// Rotina de inicializa��o, construtor
	public Conta2(int agencia, int numero) {
		Conta2.total++;
		//System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero + " com ag�ncia " + this.agencia);
	}
	
	
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
	
	
	// GET E SET
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// Normalmente m�todos que alteram o atributo s�o void
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�mero inv�lido.");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor negativo ou zero.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta2.total;
	}
	
}
	