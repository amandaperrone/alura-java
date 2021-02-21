
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		//Gerente g2 = new Funcionario();   Não funciona pois nem todo funcionário é gerente
		
		g1.setNome("Amanda");
		String nome = g1.getNome();
		System.out.println(nome);
		
		g1.setSalario(5000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500);
		
		Designer d1 = new Designer();
		d1.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
	}

}
