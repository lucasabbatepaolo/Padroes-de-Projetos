package br.com.lca.factorymethod;

import java.util.Calendar;

public class EmpresaOnibusInterMunicipal extends Empresa {

    @Override
    Passagem gerarPassagem(String origem, String destino, Calendar data) {
        return new PassagemInterMunicipal(origem, destino, data);
    }

}
