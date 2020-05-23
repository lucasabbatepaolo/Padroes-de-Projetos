package br.com.lca.state;

public class Bebe extends Humano {


    public Bebe() {
        super(new Engatinhar());
    }

    @Override
    public void mover() {
        super.movimento.executarComportamento();
    }
}
