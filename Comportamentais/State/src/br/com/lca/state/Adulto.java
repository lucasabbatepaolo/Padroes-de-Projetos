package br.com.lca.state;

public class Adulto extends Humano {

    public Adulto() {
        super(new Andar());
    }

    @Override
    public void mover() {
        super.movimento.executarComportamento();
    }
}
