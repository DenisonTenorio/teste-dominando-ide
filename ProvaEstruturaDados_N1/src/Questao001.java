import java.util.*;

public class Questao001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 9, 14, 23, 15, 0, 9};
		int tamanho = arr.length;
			
		for (int i = 0; i < tamanho; i++) {
			
			int j;
			for (j = i + 1; j < tamanho; j++) {
				
				if (arr[i] <= arr[j])
					break;
			}
			if (j == tamanho)
				System.out.print(arr[i] + " ");
		}
	}

}
