package br.com.lca.mediator;

public class MesaDeAtendimento {

    String codigoDaMesa;
    Mediator controleDeSenhas;

    public MesaDeAtendimento(String codigoDaMesa, Mediator mediator) {
        this.codigoDaMesa = codigoDaMesa;
        this.controleDeSenhas = mediator;
    }

    public void chamarProximaSenha() {
        controleDeSenhas.chamarProximo();
    }
}
