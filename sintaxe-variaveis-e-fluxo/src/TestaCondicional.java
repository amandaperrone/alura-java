
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18, j� pode ir preso!");
		} else {
			if(quantidadePessoas >=2)
				System.out.println("Pode vim, est� acompanhado");
			else 
				System.out.println("Ta sussa, ainda n�o paga boleto");
		}
	}
}
