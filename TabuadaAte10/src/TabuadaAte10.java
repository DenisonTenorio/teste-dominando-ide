import java.util.Scanner;

public class TabuadaAte10 {

	public static void main(String[] args) {
		
		int numero, contador;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o N�mero de Entrada da Tabuada: ");
		numero = LerTeclado.nextInt();
		
		LerTeclado.close();
		
		System.out.println(""); System.out.println("Segue Abaixo a Tabuada at� x10:"); System.out.println("");
		
		// for(valor inicial; condi��o; passo) { }
		// passo quando for "mais um" pode usar contador++
		for (contador = 0; contador <= 10; contador = contador + 1){ 
			System.out.println("  " + numero + " X " + contador + " = " +(numero * contador));}
		}
		
	}
