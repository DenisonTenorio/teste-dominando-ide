import java.util.Scanner;
public class ConsumoMedio {

	public static void main(String[] args) {
		
		double consumomedio, distanciapercorrida, combustivelgasto;
		
		Scanner LerTeclado = new Scanner (System.in);
		
		System.out.print("Entre com a dist�ncia total percorrida (km) : ");
		distanciapercorrida = LerTeclado.nextDouble();
		
		System.out.print("Entre com o total de combust�vel gasto (litros) : ");
		combustivelgasto = LerTeclado.nextDouble();
		
		consumomedio = distanciapercorrida / combustivelgasto;
		
		System.out.println("");
		System.out.printf("Seu Autom�vel teve um consumo m�dio de %.2f", consumomedio); System.out.println(" km/l");
		
		LerTeclado.close();
	}

}
