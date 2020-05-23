package br.com.lca.abstractfactory;

public class CarroFactory {

    Carro getSuv() {
        return new SUV();
    }

    Carro getSedan() {
        return new Sedan();
    }
}
