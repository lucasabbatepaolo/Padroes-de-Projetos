package br.com.lca.templatemethod;

public class Pastel extends Receita {

    @Override
    void separarIngredientes() {
        System.out.println("Pegar massa e queijo");
    }

    @Override
    void prepararReceita() {
        System.out.println("fritar");
    }
}
