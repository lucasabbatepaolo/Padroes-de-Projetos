package br.com.lca.templatemethod;

public class Main {

    public static void main(String[] args) {
        Receita pastel = new Pastel();
        Receita bolo = new ReceitaDeBolo();

        pastel.servir();;
        bolo.servir();
    }

}
