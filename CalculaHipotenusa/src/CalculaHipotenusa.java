import java.util.Scanner;

public class CalculaHipotenusa {

	public static void main(String[] args) {
		
		double hipotenusa;
		double catetoAdj;
		double catetoOpo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o cateto adjacente: ");
		catetoAdj = teclado.nextDouble();
		
		System.out.print("Digite o cateto oposto: ");
		catetoOpo = teclado.nextDouble();
		
		teclado.close();
		
		// h� = catetoAdj� + catetoOpo� => h = raizQuadrada(cotetoAdj� + cotetoOpo�)
		hipotenusa = Math.sqrt(Math.pow(catetoAdj, 2.0) + Math.pow(catetoOpo, 2.0));
		
		// Math.pow = calcula a pot�ncia
		// Math.sqrt = calcula a raiz quadrada
		
		System.out.println("A hipotenusa � " + hipotenusa);

	}

}
