package br.com.lca.facade;

public class ControleDeEstoque {
    private Estoque estoque = new Estoque();

    public void addItem(String nome, int quantidade) {
        Produto p = new Produto(nome, quantidade);
        estoque.addProduto(p);

    }

    public void verEstoque() {
        estoque.listar();
    }
}
