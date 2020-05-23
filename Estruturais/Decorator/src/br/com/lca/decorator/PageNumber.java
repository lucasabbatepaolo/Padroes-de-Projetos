package br.com.lca.decorator;

public class PageNumber extends ComponentesRelatorio {

    public PageNumber(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Show Page Number, ");
    }
}
