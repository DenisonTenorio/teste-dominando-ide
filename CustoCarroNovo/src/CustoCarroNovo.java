import java.util.Scanner;

public class CustoCarroNovo {

	public static void main(String[] args) {
		
		double custo_fabrica, custo_consumidor, porcent_distribuidor, impostos;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Informe o Custo de Produção do Automóvel (R$):  ");
		custo_fabrica = LerTeclado.nextDouble();
		
		LerTeclado.close();

		impostos = custo_fabrica * 55/100;
		porcent_distribuidor = (custo_fabrica + impostos) * 30/100;
		custo_consumidor = custo_fabrica + porcent_distribuidor + impostos;
		
		System.out.println("");
		
		System.out.printf("O Custo ao Consumidor é de:  R$ %.2f", custo_consumidor);
	}

}
