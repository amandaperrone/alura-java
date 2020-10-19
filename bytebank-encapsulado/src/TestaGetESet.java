
public class TestaGetESet {

	public static void main(String[] args) {
		Conta2 conta = new Conta2(2253, 12345);
		
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente amanda = new Cliente();
		//conta.titular = amanda;
		//amanda.nome = "amanda perrone";
		amanda.setNome("Amanda Perrone");
		conta.setTitular(amanda);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
		System.out.println(conta.getTitular().getProfissao());
	}
}
