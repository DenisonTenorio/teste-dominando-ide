import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class App {    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("QUANTOS FUNCIONARIOS SERÃO CADASTRADOS? ");
        int n = sc.nextInt();
        //COLETA DOS DADOS DOS FUNCIONÁRIOS
        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("FUNCIONARIO " +i+": " );

            System.out.println("INFORME O ID DO FUNCIONARIO");
            int id = sc.nextInt();
            while (ValidarId(list, id)) {
                System.out.println("ID JÁ EXISTE NA LISTA, FAVOR INFORMAR OUTRO: ");
                id = sc.nextInt();
            }

            System.out.println("INFORME O NOME DO FUNCIONARIO");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("INFORME O SALÁRIO DO FUNCIONARIO");
            double salario = sc.nextDouble();

            list.add(new Funcionario(id, nome, salario));
        }

        //INCREMENTO SALARIAL
        System.out.println("INFORME O FUNCIONÁRIO QUE DESEJA AUMENTAR O SALÁRIO: ");
        int idFuncAlt = sc.nextInt();

        Funcionario func = list.stream().filter(x -> x.getId() == idFuncAlt).findFirst().orElse(null);

        if (func == null) {
            System.out.println("FUNCIONÁRIO NÃO EXISTE NA LISTAGEM!");
        } else {
            System.out.println("INFORME O PERCENTUAL");
            int perc = sc.nextInt();
            func.incrementoSalario(perc);
        }

        //LISTAGEM DE TODOS OS FUNCIONÁRIOS CADASTRADOS
        System.out.println();
        System.out.println("LISTAGEM DOS FUNCIONARIOS: ");
        for (Funcionario listagemfunc : list) {
            System.out.println(listagemfunc);
        }
        sc.close();
    }

    public static boolean ValidarId(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;

    }
}
