package br.com.lca.visitor;

public class ComissãoVisitor {

    void adicionarComissao(Carro carro) {
        carro.setPreco(carro.getPreco() * 1.2);

    }
}
