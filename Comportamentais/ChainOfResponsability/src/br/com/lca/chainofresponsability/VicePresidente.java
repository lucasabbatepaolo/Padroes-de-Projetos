package br.com.lca.chainofresponsability;

public class VicePresidente extends Empregado {

    public VicePresidente() {
        super(new Presidente());
    }

    @Override
    public void aprovarCompra(Compra compra) {
        if(compra.getValor() < 1000) {
            System.out.println("Compra aprovada pelo Vice Presidente!");
        } else {
            sucessor.aprovarCompra(compra);
        }
    }
}
