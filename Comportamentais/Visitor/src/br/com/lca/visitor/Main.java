package br.com.lca.visitor;

public class Main {

    public static void main(String[] args) {
        Carro c = new Ferrari();
        ComissãoVisitor cv = new ComissãoVisitor();
        cv.adicionarComissao(c);
        System.out.println(c.getPreco());
    }
}
