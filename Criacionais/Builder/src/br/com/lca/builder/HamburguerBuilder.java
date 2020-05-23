package br.com.lca.builder;

public class HamburguerBuilder extends SanduicheBuilder {
    @Override
    String montarLanche() {
        System.out.println("Hamburguer");
        return "Hamburguer";
    }
}
