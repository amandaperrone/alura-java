
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta2 contaFulano = new Conta2();
		//System.out.println(contaFulano.saldo);
		System.out.println(contaFulano.getSaldo());		
		
		contaFulano.titular = new Cliente ();
		System.out.println(contaFulano.titular);
		
		contaFulano.titular.nome = "Fulano";
		System.out.println(contaFulano.titular.nome);
	}
}
