package br.com.lca.factorymethod;

import java.util.Calendar;

public class PassagemMunicipal extends Passagem {


    public PassagemMunicipal(String origem, String destino, Calendar date) {
        super(origem, destino, date);
    }

    @Override
    String exibeDetalhes() {
        return "Municipal: ";
    }
}
