package br.com.lca.factorymethod;

import java.util.Calendar;

public abstract class Passagem {

    private String origem;
    private String destino;
    private Calendar date;

    public Passagem(String origem, String destino, Calendar date) {
        this.origem = origem;
        this.destino = destino;
        this.date = date;
    }

    abstract String exibeDetalhes();

}
