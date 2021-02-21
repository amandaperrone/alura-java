// Gerente é um funcionário e herda c
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// reescrita, pois mesma assinatura do método getBonificação de Funcionario.java
	public double getBonificacao() {
		System.out.println("Chamando método getBonificacao - classe gerente");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}
	 
}
