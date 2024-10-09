package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        //Cria uma lista vazia para adicionar as tarefas para remover que possuem a descricao recebida por parametro
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //Pega cada tarefa e compara a descricao, se for igual adiciona na lista
        for(Tarefa t : listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        //Pega a lista original e remove o que estiver na lista para remover
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(listaTarefa);
    }

//    public static void main(String[] args) {
//        ListaTarefa listaTarefa = new ListaTarefa();
//
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.adicionarTarefa("Tarefa 1");
//        listaTarefa.adicionarTarefa("Tarefa 1");
//        listaTarefa.adicionarTarefa("Tarefa 2");
//
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.removerTarefa("Tarefa 1");
//        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.obterDescricaoTarefa();
//    }
}
