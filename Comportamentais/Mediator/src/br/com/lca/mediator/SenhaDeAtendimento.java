package br.com.lca.mediator;

public class SenhaDeAtendimento {

    private int numero;
    private boolean preferencial;

    public SenhaDeAtendimento(int numero, boolean preferencial) {
        this.numero = numero;
        this.preferencial = preferencial;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public int getNumero() {
        return numero;
    }
}
