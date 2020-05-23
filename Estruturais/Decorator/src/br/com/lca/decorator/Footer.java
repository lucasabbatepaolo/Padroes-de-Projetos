package br.com.lca.decorator;

public class Footer extends  ComponentesRelatorio {


    public Footer(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Show Footer, ");
    }
}
