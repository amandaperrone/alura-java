
public class TesteFuncionario {

	public static void main(String[] args) {

		// Funcionario nico = new Funcionario();   não funciona mais devido à classe conta se tornar abstract
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("123.456.789-00");
		nico.setSalario(2590.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
