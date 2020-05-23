package br.com.lca.bridge;

public abstract class Professor {

    private Implementacao implementacao;

    public Professor(Implementacao implementacao) {
        this.implementacao = implementacao;
    }

    public void info() {
        implementacao.info();
    }
}
