
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaAmanda = new Conta();
		contaDaAmanda.saldo= 1000;
		contaDaAmanda.deposita(550);
		
		System.out.println(contaDaAmanda.saldo);
		boolean conseguiuRetirar = contaDaAmanda.saca(2000);
		System.out.println(conseguiuRetirar);
		System.out.println("Saldo: " + contaDaAmanda.saldo);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		
		if (contaDaAna.transfere(150, contaDaAmanda)) {
			System.out.println("Transferido com sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDaAmanda.saldo);
		
		contaDaAmanda.titular = "Amanda Perrone";
		System.out.println(contaDaAmanda.titular);
	}
}
