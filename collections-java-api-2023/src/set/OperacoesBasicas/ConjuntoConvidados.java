package set.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        this.convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : this.convidadoSet) {
            if(c.getCodigoConvite() == codigo) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados");

        convidados.adicionarConvidado("Pedro", 12);
        convidados.adicionarConvidado("Maria", 32);
        convidados.adicionarConvidado("Marcos", 40);
        convidados.adicionarConvidado("Paula", 10);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados");

        convidados.removerConvidado(12);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados");

        convidados.exibirConvidados();
    }


}
