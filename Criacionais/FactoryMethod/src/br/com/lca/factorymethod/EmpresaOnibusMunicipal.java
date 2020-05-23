package br.com.lca.factorymethod;

import java.util.Calendar;

public class EmpresaOnibusMunicipal extends Empresa {

    @Override
    Passagem gerarPassagem(String origem, String destino, Calendar data) {
        return new PassagemMunicipal(origem, destino, data);
    }

}
