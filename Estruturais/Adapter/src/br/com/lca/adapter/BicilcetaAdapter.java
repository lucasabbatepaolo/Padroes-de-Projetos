package br.com.lca.adapter;

public class BicilcetaAdapter implements Veiculo {
    Bicicleta bicicleta = new Bicicleta();

    public BicilcetaAdapter(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public void ligar() {
        bicicleta.pedalar();
    }
}
