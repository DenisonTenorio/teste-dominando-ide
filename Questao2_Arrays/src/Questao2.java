import java.util.Arrays;

@SuppressWarnings("unused")
public class Questao2 {

	public static void main(String[] args) {

		int meu_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, };
		int soma = 0;

		for (int i : meu_array)
			soma += i;

		System.out.println("A soma dos Valores da Matriz é: " + soma);
	}
}