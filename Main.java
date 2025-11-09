import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDeTarefas lista = new ListaDeTarefas();
        int opcao;

        do {

            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Concluir tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = sc.nextLine();
                    lista.adicionar(new Tarefa(titulo));
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa para remover: ");
                    int remover = sc.nextInt();
                    lista.remover(remover);
                    break;
                case 3:
                    lista.listar();
                    break;
                case 4:
                    System.out.print("Digite o índice da tarefa para concluir: ");
                    int concluir = sc.nextInt();
                    lista.concluir(concluir);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
