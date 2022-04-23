import java.util.Scanner;

public class SomaDoisNumeros {
	
	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		numero1 = LerTeclado.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		numero2 = LerTeclado.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("A Soma dos Números é igual a " + soma);
		
		LerTeclado.close();

	}
}