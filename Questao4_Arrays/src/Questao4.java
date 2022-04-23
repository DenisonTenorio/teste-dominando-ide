import java.util.Arrays;

public class Questao4 {

	public static void main(String[] args) {
		int[] numb = new int[] { 20, 30, 25, 35, -16, 60, -100 };

		double soma = 0;
		for (int i = 0; i < numb.length; i++)
			soma = soma + numb[i];

		double med = soma / numb.length;
		System.out.printf("O valor médio dos elementos do Array é : %.2f", med);
	}
}
