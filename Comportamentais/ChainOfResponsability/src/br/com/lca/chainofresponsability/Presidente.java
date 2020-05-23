package br.com.lca.chainofresponsability;

public class Presidente extends Empregado {

    public Presidente() {
        super(null);
    }

    @Override
    public void aprovarCompra(Compra compra) {
        System.out.println("Compra aprovada pelo Presidente!");
    }
}
