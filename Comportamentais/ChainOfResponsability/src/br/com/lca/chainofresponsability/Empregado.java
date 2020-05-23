package br.com.lca.chainofresponsability;

public abstract class Empregado {

    protected Empregado sucessor;

    public Empregado(Empregado sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void aprovarCompra(Compra compra);
}
