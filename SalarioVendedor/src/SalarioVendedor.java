import java.util.Scanner;
public class SalarioVendedor {

	public static void main(String[] args) {
		
		String nome_vendedor;
		double salario_fixo, vendas_mes, comissao_20, salario_final;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.print("Informe o nome do Vendedor: ");
		nome_vendedor = LerTeclado.nextLine();
		
		System.out.print("Informe o seu Salário fixo (R$): ");
		salario_fixo = LerTeclado.nextDouble();
		
		System.out.print("Informe o Valor de suas Vendas no mês (R$): ");
		vendas_mes = LerTeclado.nextDouble();
		
		LerTeclado.close();
		
		comissao_20 = vendas_mes * 20/100;
		salario_final = salario_fixo + comissao_20;
		
		System.out.println("");
		
		System.out.println("Vendedor: " + nome_vendedor);
		System.out.printf("Salário fixo: R$ %.2f", salario_fixo); System.out.println("");
		System.out.printf("Salário final a receber: R$ %.2f", salario_final); System.out.println("");
	}

}
