package br.com.lca.facade;

class Produto {

    private String nome;
    private int quantidade;

    protected Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    protected String getNome() {
        return this.nome;
    }
}
