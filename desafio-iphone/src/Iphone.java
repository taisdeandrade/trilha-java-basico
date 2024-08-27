
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Reprodutor Musical
    public void tocar(){
        
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando musica");
    }

    //Aparelho telefonico
    public void atender(){
        System.out.println("Atendendo licacao");
    }

    public void ligar(){
        System.out.println("Realizando ligacao");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    //Navegador Internet
    public void exibirPagina(){
        System.out.println("Exibindo pagina.");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina.");
    }
}
