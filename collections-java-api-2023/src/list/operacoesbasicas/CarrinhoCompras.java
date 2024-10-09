package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listaItems;

    public CarrinhoCompras() {

        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        listaItems.add(item);
    }

    public void removerItem(String nome) {
        //Cria uma lista vazia para adicionar os itens para remover que possuem o nome recebido por parametro
        List<Item> itemParaRemover = new ArrayList<>();
        //Pega cada item e compara o nome, se for igual adiciona na lista
        for (Item item : listaItems) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(item);
            }
        }
        //Pega a lista original e remove o que estiver para remover
        listaItems.removeAll(itemParaRemover);
    }

    public void calcularValorTotal() {
        double valor = 0d;
        for (Item item : listaItems) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valor += valorItem; //valorTotal = valorTotal + valorItem;
        }
        System.out.println("O valor total da compra é = " + valor);
    }

    public void exibirItens(){
        System.out.println(this.listaItems);
    }

    @Override
    public String toString() {
        return "Carrinho de compras{ " +" itens = " + listaItems + '}';
    }


    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Café", 14.20, 1);
        carrinho.adicionarItem("Leite", 4.50, 2);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("Leite");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
