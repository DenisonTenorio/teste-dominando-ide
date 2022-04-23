import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int questao;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Informa qual quest�o deseja desenvolver: ");
			System.out.println("");
			System.out.println("1 - C�lculo Tri�ngulo, circulo, quadrado, ret�ngulo, trap�io ");
			System.out.println("2 - Ler duas Pe�as e Calcular o valor total da Nota ");
			System.out.println("3 - DIFERENCA = (A * B - C * D). ");
			System.out.println("4 - C�lculo de Almo�o");
			System.out.println("5 - Compra de Bolsa");
			System.out.println("0 - Sair");
					
			questao = sc.nextInt();
			
			if (questao == 0) {
				System.out.println("\nAt� Logo!");
				sc.close();			
			}
			
			switch (questao){
	        case 1:
	    		//letra a:
	    		double pi = Math.PI;
	    		double valorA, valorB, valorC, area_triangulo;
	    		
	    		System.out.println("Digite o primeiro Valor (A): ");
	    		valorA = sc.nextDouble();
	    		System.out.println("Digite o Segundo Valor (B): ");
	    		valorB = sc.nextDouble();
	    		System.out.println("Digite o Terceiro Valor (C): ");
	    		valorC = sc.nextDouble();
	    		
	    		//letra a:
	    		//�rea do tri�ngulo = (Base * Altura) / 2
	    		area_triangulo = (valorA * valorC) / 2;
	    		System.out.printf("A �rea do triangulo que tem (A) por base e (C) por altura � de %.2f", area_triangulo); System.out.println("");
	    		
	    		//letra b:
	    		//area do circulo = pi * raio �
	    		double area_circulo;
	    		area_circulo = pi * Math.pow(valorC,2);
	    		System.out.printf("A �rea do Circulo de Raio (C) � de %.2f", area_circulo); System.out.println("");
	    		
	    		//letra c:
	    		//�rea do trapezio = (base menor + base maior) / 2  x altura
	    		double area_trapezio;
	    		area_trapezio = ((valorA + valorB) / 2) * valorC;
	    		System.out.printf("A �rea do Trapezio que tem (A) e (B) por base e (C) por Altura � de %.2f", area_trapezio); System.out.println("");
	    		
	    		//letra d:
	    		//�rea do quadrado = lado �
	    		double area_quadrado = Math.pow(valorB,2);
	    		System.out.printf("A �rea do Quadrado que tem lado (B) � de %.2f", area_quadrado); System.out.println("");
	    		
	    		//letra e:
	    		//�rea do ret�ngulo = base x altura
	    		double area_retangulo = valorA * valorB;
	    		System.out.printf("A �rea do Ret�ngulo que tem lados (A) e (B) � de %.2f", area_retangulo); System.out.println("");
	    		
	       		break;	    		
	        case 2:
	    		//Criar C�digo aqui
	    		int numero_peca1, numero_peca2;
	    		double valor_peca1, valor_peca2;
	    		double valor_pagar1, valor_pagar2, valor_pagartotal;
	    		
	    		System.out.print("Digite a Quant. Pe�as (1): ");
	    		numero_peca1 = sc.nextInt();
	    		System.out.print("Digite o Valor da Pe�a (1): R$ ");
	    		valor_peca1 = sc.nextDouble();
	    		System.out.print("Digite a Quant. Pe�as (2): ");
	    		numero_peca2 = sc.nextInt();
	    		System.out.print("Digite o Valor da Pe�a (2): R$ ");
	    		valor_peca2 = sc.nextDouble();
	    		
	    		valor_pagar1 = numero_peca1 * valor_peca1;
	    		valor_pagar2 = numero_peca2 * valor_peca2;
	    		valor_pagartotal = valor_pagar1 + valor_pagar2;
	    		System.out.printf("O Valor a ser pago � de R$ %.2f", valor_pagartotal); System.out.println("");
	    		
	            break;	            
	        case 3:
	    		//Criar C�digo aqui
	    		int valor_a, valor_b, valor_c, valor_d, resultado;
	    		
	    		System.out.println("Digite o primeiro Valor (A): ");
	    		valor_a = sc.nextInt();
	    		System.out.println("Digite o Segundo Valor (B): ");
	    		valor_b = sc.nextInt();
	    		System.out.println("Digite o Terceiro Valor (C): ");
	    		valor_c = sc.nextInt();
	    		System.out.println("Digite o Terceiro Valor (D): ");
	    		valor_d = sc.nextInt();
	    		
	    		//Resultado = (A*B)-(C*D)
	    		resultado = (valor_a * valor_b) - (valor_c * valor_d);
	    		
	    		System.out.println("O resultado da diferen�a de (A*B) - (C*D) � = " + resultado);
	    		
	    		break;	    		
	        case 4:
	            //Criar C�digo aqui
	            double preco_prato = 23.00;
	            double peso, valor_a_pagar;
	            
	            System.out.print("Informe o peso total de sua Refei��o (kg): ");
	            peso = sc.nextDouble();
	            
	            valor_a_pagar = peso * preco_prato;
	            System.out.printf("Valor a Pagar � de R$ %.2f", valor_a_pagar); System.out.println("");
	            
	            break;	            
	        case 5:	        	           
	            //Criar C�digo aqui
	            double valor_bolsa, valor_pagamento;
	            int forma_pag; 
	            
	            System.out.print("Informe o valor da Bolsa: R$ ");
	            valor_bolsa = sc.nextDouble();
	            System.out.println("Informe a forma de pagamento: ");
	            System.out.println(" 1 - A vista com 10% de desconto.");
	            System.out.println(" 2 - Parcelado 1+2 vezes sem desconto.");
	            System.out.println(" 3 - Dividido em 10 vezes com juros de 5% sobre valor total.");
	            forma_pag = sc.nextInt();
	            
	            if (forma_pag == 1){
	                valor_pagamento = valor_bolsa * 10/100;
	                System.out.printf("O valor a ser pago a vista � de R$ %.2f", valor_pagamento); System.out.println("");
	            }   
	            else if (forma_pag == 2){
	                valor_pagamento = valor_bolsa / 3;
	                System.out.printf("O valor a ser pago ser� de entrada + 2 parcelas de R$ %.2f",valor_pagamento); System.out.println("");
	            }
	            else if (forma_pag == 3){
	                valor_pagamento = (valor_bolsa * 5/100) + valor_bolsa / 10;
	                System.out.printf("O valor a ser pago ser� de 10 parcelas de R$ %.2f",valor_pagamento); System.out.println("");
	           }
	           else {
	               System.out.print("Escolha umas das 3 op��es acima");
	           }
	           
	            break;	        
			}			
		} while (questao != 0);		
		sc.close();		
	}
}