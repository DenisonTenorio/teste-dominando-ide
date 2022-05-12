import java.util.*;
public class Questao003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {0,1,0,2,0,8,0};
			int i = 0;
			
			for(int j = 0, l = s.length; j < l;) {
				if (s[j] == 0)
					j++;
				else {
					int aux = s[i];
					s[i] = s[j];
					s[j] = aux;
					i ++;
					j ++;
				}
			}
			while (i < s.length)
				s[i++] = 0;
			for(int n : s)
				System.out.println(n+" ");
				System.out.println("\n");

	}
}	
	
