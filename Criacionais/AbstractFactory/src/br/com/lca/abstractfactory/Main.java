package br.com.lca.abstractfactory;

public class Main {

    public static void main (String a[]) {

        CarroFactory factory = new CarroFactory();
        Carro suv = factory.getSuv();
        Carro sedan = factory.getSedan();
        System.out.println(suv.exibeInfos());
        System.out.println(sedan.exibeInfos());
    }
}
