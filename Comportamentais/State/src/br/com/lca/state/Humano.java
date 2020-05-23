package br.com.lca.state;

public abstract class Humano {

    Comportamento movimento;

    public Humano(Comportamento movimento) {
        this.movimento = movimento;
    }

    public abstract void mover();
}
