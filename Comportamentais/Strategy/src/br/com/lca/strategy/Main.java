package br.com.lca.strategy;

public class Main {

    public static void main(String[] args) {

        BaseDePessoas base = new BaseDePessoas(new BuscaPorNome());
        base.buscar();

        base.setAlgoritimo(new BuscaPorSobrenome());
        base.buscar();
    }
}
