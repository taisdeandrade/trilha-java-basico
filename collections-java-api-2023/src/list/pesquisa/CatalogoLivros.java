package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty())
        {//para cada livro (l) dentro da livroList
            for(Livro l : livroList){
                //se encontrar o autor, insere na nova lista
                if(l.getAutor().equals(autor))
                {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquiserPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAnos = new ArrayList<>();
        if(!livroList.isEmpty())
        {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                {
                    livrosPorAnos.add(l);
                }
            }
        }
        return livrosPorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo))
                {
                    livroTitulo = l;
                    //encontrou o primeiro, termina o laco
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", 1954);
        catalogo.adicionarLivro("O Senhor dos Anéis: As Duas Torres", "J. R. R. Tolkien", 1954);
        catalogo.adicionarLivro("O Senhor dos Anéis: O Retorno do Rei", "J. R. R. Tolkien", 1955);
        catalogo.adicionarLivro("A Guerra dos Tronos", "George R. R. Martin", 1996);
        catalogo.adicionarLivro("A Fúria dos Reis", "George R. R. Martin", 1998);
        catalogo.adicionarLivro("A Tormenda de Espadas", "George R. R. Martin", 2000);

        System.out.println(catalogo.pesquisarPorAutor("George R. R. Martin"));

        System.out.println(catalogo.pesquiserPorIntervaloAnos(1954, 1955));

        System.out.println(catalogo.pesquisarPorTitulo("A Guerra dos Tronos"));


    }
}
