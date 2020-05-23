package br.com.lca.strategy;

public class BaseDePessoas {

    private AlgoritmoBusca algoritimo;

    public BaseDePessoas(AlgoritmoBusca algoritimo) {
        this.algoritimo = algoritimo;
    }

    public void buscar() {
        algoritimo.buscar();
    }

    public void setAlgoritimo(AlgoritmoBusca algoritimo) {
        this.algoritimo = algoritimo;
    }
}
