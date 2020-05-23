package br.com.lca.command;

public class Main {

    public static void main(String[] args) {

        Frase f = new Frase();
        Invoker i = new Invoker();
        i.execute(new Concatenar("Hello ", f));
        i.execute(new Concatenar("World ", f));
        i.execute(new Concatenar("! ", f));

        i.desfazer();
        i.desfazer();



    }
}
