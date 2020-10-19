
public class TestaConversao {
	public static void main(String[] args ) {
		/*
		 * double salario = 1270.50; 
		 * int valor = salario;
		 * NÃO COMPILA
		 */
		
		float pontoFlutuante = 3.14f;
		
		double salario = 1270.50;
		int valor = (int) salario; // converte o double para int
		System.out.println(valor);
		
		int guarda2milhoes;
		long guardaNumeroGrande = 515111651651L; // Esse L indica que é um long
		short valorPequeno = 3215;
		byte b = 127; // Vai apenas até o 127
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; // resultado: 0.30000000000000004
		
		System.out.println(total);
	}
}
