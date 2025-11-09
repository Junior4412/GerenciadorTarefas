import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + " - " + tarefas.get(i));
            }
        }
    }

    public void concluir(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).concluir();
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
