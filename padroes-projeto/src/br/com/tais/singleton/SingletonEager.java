package br.com.tais.singleton;

public class SingletonEager {
    //No momento que é chamada já é instanciada
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {  }
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
