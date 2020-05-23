package br.com.lca.flyweight;

import java.util.HashMap;

public class CarroFactory {

    private static final HashMap<String, Carro> carros  = new HashMap<String, Carro>();

    public static Carro getCarro(String nome) {
        Carro carro = carros.get(nome);
        if (carro == null) {
            switch (nome) {
                case "fusca":
                    carro = new Fusca(nome);
                    break;
                case "onix":
                    carro = new Onix(nome, false);
                    break;
                case "onix automatico":
                    carro = new Onix(nome, true);
                    break;

            }
        }
        return carro;
    }

}
