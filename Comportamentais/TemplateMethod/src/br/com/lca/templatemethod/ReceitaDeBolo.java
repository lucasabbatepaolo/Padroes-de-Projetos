package br.com.lca.templatemethod;

public class ReceitaDeBolo extends Receita{


    @Override
    void separarIngredientes() {
        System.out.println("Pegar Farinha e chocolate");
    }

    @Override
    void prepararReceita() {
        System.out.println("Assar por 15 minutos");
    }


}
