import java.util.Scanner;

public class CalculoComDoisNumeros {

	public static void main(String[] args) {
		
		double numero1, numero2, soma,subtracao, multiplicacao, divisao;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		numero1 = LerTeclado.nextDouble();
		
		System.out.print("Entre com o segundo n�mero: ");
		numero2 = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.println("");
		System.out.println("Resultados dos C�lculos: ");
		System.out.printf(" Soma = %.2f", soma); System.out.println("");
		System.out.printf(" Subtra��o = %.2f", subtracao); System.out.println("");
		System.out.printf(" Multiplica��o = %.2f", multiplicacao); System.out.println("");
		System.out.printf(" Divis�o = %.2f", divisao);
		
	}

}
