
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta2 conta = new Conta2();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		System.out.println(conta.getSaldo());
	}
}

