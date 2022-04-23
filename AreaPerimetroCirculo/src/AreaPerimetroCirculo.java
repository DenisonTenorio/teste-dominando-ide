import java.util.Scanner;
//import java.util.Locale;

public class AreaPerimetroCirculo {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		double pi = Math.PI;
		double raio, area, perimetro;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Informe o Raio do Círculo (cm): ");
		raio = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		// Área do Circulo = pi * Raio ²
		// Perímetro do Circulo = 2 * pi * Raio
		
		area = pi * Math.pow(raio,2);
		perimetro = 2 * pi * raio;
		
		System.out.println(""); System.out.printf("A Área é igual a %.2f", area); System.out.println(" cm²");
		System.out.println(""); System.out.printf("O perímetro é igual a %.2f", perimetro); System.out.println(" cm");
	}

}
