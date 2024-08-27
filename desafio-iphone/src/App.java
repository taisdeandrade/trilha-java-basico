public class App {
    public static void main(String[] args) {
        Iphone reprodutoMusical = new Iphone();

        reprodutoMusical.tocar();
        reprodutoMusical.pausar();
        reprodutoMusical.selecionarMusica();

        Iphone aparelhoTelefonico = new Iphone();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        Iphone navegadorInternet = new Iphone();

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }
}
