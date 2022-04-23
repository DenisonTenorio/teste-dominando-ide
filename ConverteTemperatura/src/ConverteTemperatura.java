import java.util.Scanner;

public class ConverteTemperatura {

	public static void main(String[] args) {
		
		double celsius;
		double fah;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius (°C): ");
		
		celsius = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		fah = (9 * celsius + 160) / 5;
		
		System.out.println("");		
		System.out.printf("Temperatura em Fahrenheit é de: %.2f" , fah); System.out.println(" °F");
		
	}

}
