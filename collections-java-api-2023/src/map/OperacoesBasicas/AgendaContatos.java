package map.OperacoesBasicas;

import set.Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos (){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Maria", 12312);
        //O map atualiza para o ultimo valor
        agenda.adicionarContato("Maria", 52122);
        agenda.adicionarContato("Maria Santos", 32123);
        agenda.adicionarContato("Joao", 543123);
        agenda.adicionarContato("Paulo", 21233);

        agenda.exibirContatos();

        agenda.removerContato("Paulo");
        agenda.exibirContatos();

        System.out.println("O numero é: " + agenda.pesquisarPorNome("Joao"));



    }
}
