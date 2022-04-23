import java.util.Arrays;

public class Questao1 {

	public static void main(String[] args) {
		int [] array1 = {
		        1789, 2035, 1899, 1456, 2013,
		        1458, 2458, 1254, 1472, 2365,
		        1456, 2165, 1457, 2456};

		    String[] array2 = {
		        "Java",
		        "Python",
		        "PHP",
		        "C#",
		        "C Programming",
		        "C++"};
		    
		    System.out.println("Matriz original : "+Arrays.toString(array1));
		    Arrays.sort(array1); System.out.println();
		    System.out.println("Matriz numérica ordenada : "+Arrays.toString(array1));
		    System.out.println();
		    System.out.println("Matriz de string original : "+Arrays.toString(array2));
		    Arrays.sort(array2);System.out.println();
		    System.out.println("Matriz de strings classificada : "+Arrays.toString(array2));
		    System.out.println();
		
		}
	}
