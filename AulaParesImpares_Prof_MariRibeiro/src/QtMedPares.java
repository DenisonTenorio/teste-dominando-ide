import java.util.Scanner;

public class QtMedPares {

	private static int qt, contP, num, somaP;
	private static double media;
	
	public static void Imprimir(){ // Criado método para imprimir os resultados.
		System.out.println();
		System.out.println("Quantidade de Números Digitados: " + qt);
		System.out.println("Quantidade de Números Pares Digitados: " + contP);
		System.out.println("Média dos Números Pares Digitados: " + media);
	}
	
	public static void Teste(){	
		if(num % 2 == 0) {
			contP++;
			somaP += num; // somaP = somaP + num
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
						
		System.out.print("Quantos Números deseja Digitar ? ");
		qt = teclado.nextInt();

		for(int i = 1; i <= qt; i++) {
			System.out.print("Digitar um Número Inteiro Positivo: ");
			num = teclado.nextInt();
			Teste(); // Vai para o método Teste.			
		}
		
		media = somaP / contP;
		Imprimir(); // Vai para o método Imprimir.
		
		teclado.close();
	}	

}
