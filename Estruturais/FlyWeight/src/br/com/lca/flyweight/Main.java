package br.com.lca.flyweight;

public class Main {

    public static void main(String[] args) {
        CarroFactory.getCarro("fusca");

        CarroFactory.getCarro("onix");

        CarroFactory.getCarro("onix automatico");
    }
}
