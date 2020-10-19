
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; // APONTA PARA A PRIMEIRA CONTA
		System.out.println("Saldo segunda conta " + segundaConta.saldo);
		
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
	}
}
