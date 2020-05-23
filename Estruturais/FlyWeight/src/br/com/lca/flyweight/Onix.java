package br.com.lca.flyweight;

public class Onix extends Carro {

    private boolean automatico;

    public Onix(String nome, boolean automatico) {
        super(nome);
        this.automatico = automatico;
    }
}
