import java.util.Arrays;
import java.util.Scanner;

public class Aula_LoianeGroner {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o Valor da posi��o " + i + " : ");
			vetorA[i] = teclado.nextInt();
		}
		
		//Contar a quantidade de pares na Array.
		int qtdPares = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) { // % comnado que retorna o resto de uma divis�o, 
				// se o resto da divis�o por 2 for zero, o n�mero � par.
				qtdPares++; //qtdPares = qtdPares + 1 ...ou... qtdPares += 1 
			}
		}
		
		System.out.println();
		System.out.print("VetorA : ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de Numeros pares �: " + qtdPares);
		
		teclado.close();
	}

}
