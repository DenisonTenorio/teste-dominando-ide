import java.util.Scanner;

public class SomaDoisNumeros {
	
	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		numero1 = LerTeclado.nextInt();
		
		System.out.print("Entre com o segundo n�mero: ");
		numero2 = LerTeclado.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("A Soma dos N�meros � igual a " + soma);
		
		LerTeclado.close();

	}
}