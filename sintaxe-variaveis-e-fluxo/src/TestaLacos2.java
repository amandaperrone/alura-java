
public class TestaLacos2 {
	public static void main(String[] args) {
		//for(int linha = 0; linha < 10; linha++) {
		//	for(int col = 0; col < 10; col++) {
		//		if(col > linha)
		//			break;
		//		else
		//			System.out.print("*");
		//	}
		//	System.out.println();
		//}
		
		// OS DOIS FOR FAZEM A MESMA COISA
		for(int linha = 0; linha < 10; linha++) {
			for(int col = 0; col < linha; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
