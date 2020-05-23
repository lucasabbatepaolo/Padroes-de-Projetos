package br.com.lca.chainofresponsability;

public class Main {
    public static void main(String[] args) {
        Presidente presidene = new Presidente();
        VicePresidente vp = new VicePresidente();
        Gerente gerente = new Gerente();

        Compra compra =  new Compra(10);
        gerente.aprovarCompra(compra);

        Compra compra1 =  new Compra(150);
        gerente.aprovarCompra(compra1);

        Compra compra2 =  new Compra(1000);
        gerente.aprovarCompra(compra2);
    }
}
