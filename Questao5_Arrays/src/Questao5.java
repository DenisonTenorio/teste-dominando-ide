import java.util.Arrays;
import java.util.Scanner;

public class Questao5 {

	public static boolean contem(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		int valor_procura;
		int[] meu_array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		System.out.println("Matriz : " + Arrays.toString(meu_array));
		System.out.println();

		Scanner LerTeclado = new Scanner(System.in);
		System.out.print("Entre com o Valor a ser procurado na Matriz: ");
		valor_procura = LerTeclado.nextInt();
		System.out.println();
		boolean teste = contem(meu_array, valor_procura);

		if (teste == true) {
			System.out.println("Parabéns!!! O valor digitado pertence a Matriz");
		} else {
			System.out.println("Desculpe!!! O valor digitado não pertence a Matriz");
		}
		LerTeclado.close();
	}
}
