package br.com.lca.adapter;

public class Main {

    public static void main(String[] args) {

        Bicicleta bike = new Bicicleta();
        Veiculo veiuclo = new BicilcetaAdapter(bike);
        veiuclo.ligar();
    }
}
