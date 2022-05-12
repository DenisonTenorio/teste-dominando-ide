import java.util.*;
public class Questao004 {
	
	static boolean fatorX(int arr_int[],int n, int x) {
		
		int k;
		for (k = 0; k < n - 1; k++)
			if (arr_int[k] > arr_int[k+1])
				break;
		
		int l = (k + 1) % n;
		int r = k;
		
		while (l != r) {
			if (arr_int[l] + arr_int[r] == x)
				return true;
			if (arr_int[l] + arr_int[r] < x)
				l = (l + 1) % n;
				
				else
					r = (n + r - 1) % n;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_int[] = {22, 25, 17, 18, 19, 20};
			int m = 37;
			int n = arr_int.length;
			if (fatorX(arr_int, n, m))
				System.out.println("O resultado do Array encontrado é :" + m);
			else
				System.out.println("Array não conseguiu identificar o número :" + m);
			
	}

}
