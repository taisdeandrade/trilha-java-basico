package br.com.tais.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    //private pois ninguém pode chamar
    private SingletonLazy() {

    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
