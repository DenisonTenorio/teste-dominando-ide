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
		
		// h² = catetoAdj² + catetoOpo² => h = raizQuadrada(cotetoAdj² + cotetoOpo²)
		hipotenusa = Math.sqrt(Math.pow(catetoAdj, 2.0) + Math.pow(catetoOpo, 2.0));
		
		// Math.pow = calcula a potência
		// Math.sqrt = calcula a raiz quadrada
		
		System.out.println("A hipotenusa é " + hipotenusa);

	}

}
