import java.util.Scanner;

public class IdadeNadador {

	public static void main(String[] args) {
		
		int idade_nadador;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Informe a Idade do Nadador: ");
		idade_nadador = LerTeclado.nextInt();
		System.out.println("");
		
		LerTeclado.close();
		
		if (idade_nadador >=5 && idade_nadador <=7) {
			System.out.println("O Nadador est� na Categoria >>> Infantil A <<<");}	
		
		else if (idade_nadador >=8 && idade_nadador <=10) {
			System.out.println("O Nadador est� na Categoria >>> Infantil B <<<");}
		
		else if (idade_nadador >=11 & idade_nadador <=13) {
			System.out.println("O Nadador est� na Categoria >>> Juvenil A <<<");}
		
		else if (idade_nadador >=14 & idade_nadador <=17) {
			System.out.println("O Nadador est� na Categoria >>> Juvenil B <<<");}
		
		else if (idade_nadador >=18 & idade_nadador <=25) {
			System.out.println("O Nadador est� na Categoria >>> S�nior <<<");}
		
		else {
			System.out.println("Idade est� fora da faixa et�ria");}

	}
}
