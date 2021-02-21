
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1234, 787878);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(1235, 787979);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}

}
