import java.util.Arrays;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		int matriz[] = { 100, 400, 800, 250, 360, 700, 900 };
		System.out.print("Matriz:  ");
		
		// Outra forma de escrever o comando 'for', usado para matrizes.
		for (int valor: matriz) {
			System.out.print(valor + "  ");}
	}

	class T {
		public void remove(T elemento) {
			int procura = this.busca(elemento);
			if (procura > -1) {
				this.remove(procura);
		
		Scanner LerTeclado = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.print("Digite o elemento da Matriz para saber o seu Índice: ");
		int procura = LerTeclado.nextInt();
		
	
		
		System.out.println();
		System.out.println("O Índice do elemento escolhido é "+ indice);
		
		LerTeclado.close();
	}
}