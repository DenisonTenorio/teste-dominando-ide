import java.util.Scanner;

public class QtMedPares {

	private static int qt, contP, num, somaP;
	private static double media;
	
	public static void Imprimir(){ // Criado m�todo para imprimir os resultados.
		System.out.println();
		System.out.println("Quantidade de N�meros Digitados: " + qt);
		System.out.println("Quantidade de N�meros Pares Digitados: " + contP);
		System.out.println("M�dia dos N�meros Pares Digitados: " + media);
	}
	
	public static void Teste(){	
		if(num % 2 == 0) {
			contP++;
			somaP += num; // somaP = somaP + num
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
						
		System.out.print("Quantos N�meros deseja Digitar ? ");
		qt = teclado.nextInt();

		for(int i = 1; i <= qt; i++) {
			System.out.print("Digitar um N�mero Inteiro Positivo: ");
			num = teclado.nextInt();
			Teste(); // Vai para o m�todo Teste.			
		}
		
		media = somaP / contP;
		Imprimir(); // Vai para o m�todo Imprimir.
		
		teclado.close();
	}	

}
