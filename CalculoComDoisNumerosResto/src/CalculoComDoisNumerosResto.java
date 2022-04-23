import java.util.Scanner;

public class CalculoComDoisNumerosResto {

	public static void main(String[] args) {
		
		double numero1, numero2, soma,subtracao, multiplicacao; int divisao, resto;	
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		numero1 = LerTeclado.nextDouble();
		
		System.out.print("Entre com o segundo número: ");
		numero2 = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		int numeroInt1 = (int) numero1; int numeroInt2 = (int) numero2;
		divisao = numeroInt1 / numeroInt2;
		resto = numeroInt1 % numeroInt2;
		
		System.out.println("");
		System.out.println("Resultados dos Cálculos: ");
		System.out.printf(" Soma = %.2f", soma); System.out.println("");
		System.out.printf(" Subtração = %.2f", subtracao); System.out.println("");
		System.out.printf(" Multiplicação = %.2f", multiplicacao); System.out.println("");
		System.out.print(" Divisão = "+ divisao); System.out.print(" com resto da divisão = "+ resto);
		}
		
}
