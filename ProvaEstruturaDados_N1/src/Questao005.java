import java.util.Arrays;
public class Questao005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int[] numeros = new int[] {1, 2, 3, 4, 6, 7};
			x = 7;
		int resultado = x * ((x + 1) / 2);
		int m = 0;
		for (int i:numeros)
		{
			m += i;
		}
		System.out.println(resultado - m);
		System.out.println("\n");
	}

}
