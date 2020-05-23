package br.com.lca.interpreter;

public class Soma extends Operacao {


    @Override
    int relizarCalculo() {
        return Integer.parseInt(pedacos.get(0)) + Integer.parseInt(pedacos.get(2));
    }


}
