package br.com.lca.chainofresponsability;

public class Gerente extends Empregado {

    public Gerente() {

        super(new VicePresidente());
    }

    @Override
    public void aprovarCompra(Compra compra) {
        if(compra.getValor() < 100) {
            System.out.println("Compra aprovada pelo Gerente!");
        } else {
            sucessor.aprovarCompra(compra);
        }
    }
}
