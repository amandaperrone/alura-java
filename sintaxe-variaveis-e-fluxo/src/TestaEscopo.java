
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("--- TESTANDO CONDICIONAL ---");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		//boolean acompanhado = quantidadePessoas >=2;
		
		if (quantidadePessoas >= 2) { // Quando vari�veis s�o declaradas, valem/existem apenas dentro das chaves
			acompanhado = true;
		} else {
			acompanhado = false;
		}
			

		System.out.println("Valor de acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) { // Como 'acompanhado' � boleano, pode-se resumir acompanhado == true
			System.out.println("Pode vim");
		} else {
			System.out.println("N�o pode entrar");
		}
	}
}
