import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 32;
		System.out.println(x);
		
		Locale.setDefault(Locale.US);
		double y = 10.35784;
		System.out.println (y);
		
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
				
	}

}
