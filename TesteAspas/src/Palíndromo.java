import java.util.Scanner;

public class Palíndromo {

	public static void main(String[] args) {
		
		String palavra;
		String reversa = "";
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com a palavra ou número: ");
		palavra = LerTeclado.next();
		
		for (int i = (palavra.length() - 1); i >= 0; i--) {
			
			reversa += palavra.charAt(i);
		}
		
		if (reversa.equals(palavra)) {
			
			System.out.println("É Palíndromo");
		} else {
			
			System.out.println("Não é Palíndromo");
		}

	}

}
