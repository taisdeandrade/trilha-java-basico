package br.com.tais.singleton;

public class SingletonLazyHolder {

    //Cria uma classe estatica para encapsular a instancia
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {  }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
