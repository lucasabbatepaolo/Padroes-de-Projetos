package br.com.lca.decorator;

public abstract class ComponentesRelatorio extends Relatorio {

    Relatorio relatorio;

    public ComponentesRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public void show() {
        relatorio.show();
    }
}
