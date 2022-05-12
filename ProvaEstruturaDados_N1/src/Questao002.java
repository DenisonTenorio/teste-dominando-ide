import java.util.*;
public class Questao002 {
	
	static int x;
	static int n;

	public static void fatorX(int meu_array[]) {
		// TODO Auto-generated method stub
		x = meu_array[0];
		n = meu_array[0];
		int len = meu_array.length;
		for (int i = 1; i < len - 1; i = i + 2) {
			if (i + 1 > len) {
				if (meu_array[i] > x) x = meu_array[i];
				if (meu_array[i] < n) n = meu_array[i];
			}
			if (meu_array[i] > meu_array[i + 1]) {
				if (meu_array[i] > x) x = meu_array[i];
				if (meu_array[i + 1] < n) n = meu_array[i + 1];
			}
			if (meu_array[i] < meu_array[i + 1]) {
				if (meu_array[i] < n) n = meu_array[i];
				if (meu_array[i + 1] > x) x = meu_array[i + 1];
			}
		}
	}

	public static void main(String[] args) {
		int[] meu_array = {6, 8, 14, 56, 15, 36, 7,87, 18, 29};
		fatorX(meu_array);
		System.out.println(" valor de x :" + x);
		System.out.println(" valor de n :" + n);
	}

}
