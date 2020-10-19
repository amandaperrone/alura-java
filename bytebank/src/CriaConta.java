
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo primeira conta após depósito: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		
		System.out.println("Agencia primeira conta: " + primeiraConta.agencia);
		System.out.println("Numero primeira conta: " + primeiraConta.numero);
		
		System.out.println("Titular primeira conta: " + primeiraConta.titular);
	}
}
