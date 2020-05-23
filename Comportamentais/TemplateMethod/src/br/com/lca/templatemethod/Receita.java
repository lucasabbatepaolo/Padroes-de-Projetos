package br.com.lca.templatemethod;

public abstract class Receita {

    abstract void separarIngredientes();

    abstract void prepararReceita();

    final void servir() {
        separarIngredientes();
        prepararReceita();
        System.out.println("Colocar na mesa!!");
    }


}
