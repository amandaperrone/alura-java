
public class TestaBanco {
	public static void main(String[] args) {
		Cliente amanda = new Cliente ();
		amanda.nome = "Amanda Perrone";
		amanda.cpf = "408.724.578-00";
		amanda.profissao = "estudante";
		
		Conta2 contaAmanda = new Conta2();
		contaAmanda.deposita(100);
		
		contaAmanda.titular = amanda;
		System.out.println(contaAmanda.titular.nome);
	}
}
