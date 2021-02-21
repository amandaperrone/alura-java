// Gerente é um Funcionario e herda. Também assina o contrato Autenticavel, é um Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;

	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// reescrita, pois mesma assinatura do método getBonificação de Funcionario.java
		public double getBonificacao() {
			System.out.println("Chamando método getBonificacao - classe gerente");
			//return super.getBonificacao() + super.getSalario();
			return super.getSalario();
		}
	 
}
