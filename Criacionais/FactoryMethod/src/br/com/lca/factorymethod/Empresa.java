package br.com.lca.factorymethod;

import java.util.Calendar;

public abstract class Empresa {

    abstract Passagem gerarPassagem(String origem, String destino, Calendar data);


}
