import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
		
public class AulaGilson16_05 {

	public static void main(String[] args) throws Exception {
		// INST�NCIA LISTA
		List<String> lista = new ArrayList<>();
		// ADICIONAR DADOS NA LISTA
		lista.add("MARIA");
		lista.add("JO�O");
		lista.add("GILSON");
		lista.add("PEDRO");
		// LISTAR DADOS DA LISTA
		for (String result : lista) {
			System.out.println(result);
		}
		System.out.println("POSI��O DE PEDRO " + lista.indexOf("PEDRO"));
		System.out.println("----------------");
		// ADICIONAR NA LISTA INFORMANDO A POSI��O
		lista.add(1, "MARCELO");

		for (String result : lista) {
			System.out.println(result);
		}
		// REMOVER DA LISTA INFORMANDO O OBJETO
		lista.remove("GILSON");
		for (String result : lista) {
			System.out.println(result);
		}
		// REMOVER DA LISTA INFORMANDO A POSI��O
		lista.remove(2);
		System.out.println("-----------------");
		for (String result : lista) {
			System.out.println(result);
		}
		// REMOVER DA LISTA COM CONDICIONAL - LAMBDA -
		// https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
		lista.removeIf(x -> x == "LUCAS");
		System.out.println("-----------------");
		for (String result : lista) {
			System.out.println(result);
		}
		// REMOVER DA LISTA COM CONDICIONAL - LAMBDA BUSCANDO A PELA PRIMEIRA POSI��O
		lista.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("-----------------");
		for (String result : lista) {
			System.out.println(result);
		}
		// BUSCAR A POSI��O PELO OBJETO
		System.out.println("POSI��O DE PEDRO " + lista.indexOf("PEDRO"));
		// BUSCAR A POSI��O PELO OBJETO - CASO N�O EXISTA RETORNA -1
		System.out.println("POSI��O DE CARLOS " + lista.indexOf("CARLOS"));

		// RETORNA UMA LISTA DE ACORDO COM AO CONDICIONAL LAMBDA
		List<String> result2 = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String result : result2) {
			System.out.println(result);
		}
		// RETORNA STRING DE UMA LISTA DE ACORDO COM A CONDICIONAL LAMBDA
		String resultM = lista.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(resultM);
	}
}
		
