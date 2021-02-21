
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Amanda");
		g1.setCpf("123.456.789.-00");
		g1.setSalario(5000);
		
		System.out.println("Nome " + g1.getNome() + ", cpf " + g1.getCpf() 
		+ " e salario " + g1.getSalario());
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
