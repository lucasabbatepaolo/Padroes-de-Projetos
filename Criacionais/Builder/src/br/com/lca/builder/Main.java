package br.com.lca.builder;

public class Main {

    public static void main(String[] args) {
        SanduicheBuilder hamburguerBuilder = new HamburguerBuilder();
        SanduicheBuilder hotDogBuilder = new HotDogBuilder();
        Lanchonete lanchonete = new Lanchonete();
        lanchonete.montarLanche(hamburguerBuilder);
        lanchonete.montarLanche(hotDogBuilder);
    }
}
