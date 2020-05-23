package br.com.lca.state;

public class Main {
    public static void main(String[] args) {
        Humano adulto = new Adulto();
        Humano bebe = new Bebe();

        adulto.mover();
        bebe.mover();
    }
}
