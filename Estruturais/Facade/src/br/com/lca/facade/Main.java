package br.com.lca.facade;

public class Main {

    public static void main(String[] args) {
        ControleDeEstoque controle = new ControleDeEstoque();
        controle.addItem("Meia", 5);
        controle.addItem("camiseta", 3);

        controle.verEstoque();

    }
}
