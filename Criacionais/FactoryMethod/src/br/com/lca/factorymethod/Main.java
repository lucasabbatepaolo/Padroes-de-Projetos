package br.com.lca.factorymethod;

import java.util.GregorianCalendar;

public class Main {

    public static void main (String a[]) {
        Main run = new Main();
        run.execute();
    }

    private void execute() {

        Empresa empresaMunicipal = new EmpresaOnibusMunicipal();
        Passagem passagemMunicipal = empresaMunicipal.gerarPassagem("Jardim Satelite", "Santana", new GregorianCalendar());
        System.out.println(passagemMunicipal.exibeDetalhes());

        Empresa empresaInterMunicipal = new EmpresaOnibusInterMunicipal();
        Passagem passagemInterMunicipal = empresaInterMunicipal.gerarPassagem("Jardim Satelite", "Santana", new GregorianCalendar());
        System.out.println(passagemInterMunicipal.exibeDetalhes());
    }
}
