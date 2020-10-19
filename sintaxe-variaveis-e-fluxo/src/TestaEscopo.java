
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("--- TESTANDO CONDICIONAL ---");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		//boolean acompanhado = quantidadePessoas >=2;
		
		if (quantidadePessoas >= 2) { // Quando variáveis são declaradas, valem/existem apenas dentro das chaves
			acompanhado = true;
		} else {
			acompanhado = false;
		}
			

		System.out.println("Valor de acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) { // Como 'acompanhado' é boleano, pode-se resumir acompanhado == true
			System.out.println("Pode vim");
		} else {
			System.out.println("Não pode entrar");
		}
	}
}
