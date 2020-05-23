package br.com.lca.command;

public class Concatenar extends Command {

    public String palavra;
    public Frase frase;

    public Concatenar(String palavra, Frase frase) {
        this.palavra = palavra;
        this.frase = frase;
    }

    @Override
    public void excecutar() {
        frase.texto+= palavra;
        System.out.println(frase.texto);
    }

    @Override
    public void desfazer() {
        frase.texto = frase.texto.substring(0, frase.texto.length() - palavra.length());
        System.out.println(frase.texto);
    }
}
