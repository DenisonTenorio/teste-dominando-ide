import java.util.Scanner;

public class Pal�ndromo {

	public static void main(String[] args) {
		
		String palavra;
		String reversa = "";
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com a palavra ou n�mero: ");
		palavra = LerTeclado.next();
		
		for (int i = (palavra.length() - 1); i >= 0; i--) {
			
			reversa += palavra.charAt(i);
		}
		
		if (reversa.equals(palavra)) {
			
			System.out.println("� Pal�ndromo");
		} else {
			
			System.out.println("N�o � Pal�ndromo");
		}

	}

}
