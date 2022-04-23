import java.util.Locale;
import java.util.Scanner;

import Classes.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Produto p = new Produto();
		
		System.out.println("INSIRA OS DADOS DO PRODUTO\n");				
		System.out.println("NOME DO PRODUTO: ");
		p.nome = sc.next();		
		System.out.println("PREÇO DO PRODUTO: ");
		p.preco = sc.nextDouble();		
		System.out.println("QUANTIDADE DO PRODUTO: ");
		p.qtd = sc.nextInt();
		
		System.out.println("DADOS DO PRODUTO: " + p);
		
		System.out.println("DESEJA AUMENTAR O ESTOQUE EM QUANTO?");
		int qtd = sc.nextInt();
		p.AdicionarProduto(qtd);
		
		System.out.println();
		System.out.println("DADOS DO PRODUTO: " + p);
		
		System.out.println("DESEJA REMOVER O ESTOQUE EM QUANTO?");
		qtd = sc.nextInt();
		p.RemoverProduto(qtd);
		
		System.out.println();
		System.out.println("DADOS DO PRODUTO: " + p);
				
		sc.close();
	}

}
