// Gerente � um funcion�rio e herda c
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
	
	// reescrita, pois mesma assinatura do m�todo getBonifica��o de Funcionario.java
	public double getBonificacao() {
		System.out.println("Chamando m�todo getBonificacao - classe gerente");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}
	 
}
