package br.com.lca.builder;

public class HotDogBuilder extends SanduicheBuilder {
    @Override
    String montarLanche() {
        System.out.println("HorDog");
        return "HorDog";
    }
}
