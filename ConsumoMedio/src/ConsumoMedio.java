import java.util.Scanner;
public class ConsumoMedio {

	public static void main(String[] args) {
		
		double consumomedio, distanciapercorrida, combustivelgasto;
		
		Scanner LerTeclado = new Scanner (System.in);
		
		System.out.print("Entre com a distância total percorrida (km) : ");
		distanciapercorrida = LerTeclado.nextDouble();
		
		System.out.print("Entre com o total de combustível gasto (litros) : ");
		combustivelgasto = LerTeclado.nextDouble();
		
		consumomedio = distanciapercorrida / combustivelgasto;
		
		System.out.println("");
		System.out.printf("Seu Automóvel teve um consumo médio de %.2f", consumomedio); System.out.println(" km/l");
		
		LerTeclado.close();
	}

}
