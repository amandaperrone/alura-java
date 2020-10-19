
public class TestaValores {

	public static void main(String[] args) {
		Conta2 conta = new Conta2(1337, 24226);

		//System.out.println(conta.getAgencia());
		
		Conta2 conta2 = new Conta2(1337, 16549);
		
		System.out.println(Conta2.getTotal());
	}
}
