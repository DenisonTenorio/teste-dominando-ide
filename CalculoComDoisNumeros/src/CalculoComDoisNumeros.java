import java.util.Scanner;

public class CalculoComDoisNumeros {

	public static void main(String[] args) {
		
		double numero1, numero2, soma,subtracao, multiplicacao, divisao;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		numero1 = LerTeclado.nextDouble();
		
		System.out.print("Entre com o segundo número: ");
		numero2 = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.println("");
		System.out.println("Resultados dos Cálculos: ");
		System.out.printf(" Soma = %.2f", soma); System.out.println("");
		System.out.printf(" Subtração = %.2f", subtracao); System.out.println("");
		System.out.printf(" Multiplicação = %.2f", multiplicacao); System.out.println("");
		System.out.printf(" Divisão = %.2f", divisao);
		
	}

}
