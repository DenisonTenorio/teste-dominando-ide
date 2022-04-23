import java.util.Arrays;

public class Aula_Arrays {

	public static void main(String[] args) {

		// Criando uma Array para temperaturas em cada dia do ano.
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32.0;
		temperaturas[2] = 33.7;
		temperaturas[3] = 33.1;

		// Imprimir uma certa temperarura pelo o valor do seu índice.
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

		// Imprimir o tamanho da Array com o comando .length
		System.out.println("O tamanho da Array: " + temperaturas.length);

		// Mostrar a Arrays criada - Primeira maneira.
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O Valor da Temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}

		// Mostrar a Arrays criada - Segunda maneira, porém não se consegue visualizar o
		// índice dessa maneira.
		for (double valor_temp : temperaturas) {
			System.out.println(valor_temp);
		}

	}

}
