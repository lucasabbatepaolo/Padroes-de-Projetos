package br.com.lca.decorator;

public class Main {

    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();

        Footer f = new Footer(relatorio);
        PageNumber p = new PageNumber(f);

        p.show();

    }
}
