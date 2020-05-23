package br.com.lca.interpreter;

import java.util.Arrays;
import java.util.List;

public abstract class Operacao {

    List<String> pedacos;

    void interpretar(Expressao espressao) {
        pedacos = Arrays.asList(espressao.getExpressao().split(" "));
        espressao.setResultado(relizarCalculo());
    }

    abstract int relizarCalculo();
}
