package br.com.lca.interpreter;

public class Main {
    public static void main(String[] args) {
        Expressao e = new Expressao("1 + 1");

        Operacao op = new Soma();
        op.interpretar(e);
        System.out.println(e.getResultado());
    }
}
