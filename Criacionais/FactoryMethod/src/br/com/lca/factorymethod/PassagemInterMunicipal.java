package br.com.lca.factorymethod;

import java.util.Calendar;

public class PassagemInterMunicipal extends Passagem {

    public PassagemInterMunicipal(String origem, String destino, Calendar date) {
        super(origem, destino, date);
    }

    @Override
    String exibeDetalhes() {
        return "Intermunicipal: ";
    }

}
