package br.com.lca.iterator;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas", Genero.MASCULINO);
        Pessoa p2 = new Pessoa("Joana", Genero.FEMININO);
        Pessoa p3 = new Pessoa("José", Genero.MASCULINO);
        Pessoa p4 = new Pessoa("Maria", Genero.FEMININO);
        Pessoa p5 = new Pessoa("João", Genero.MASCULINO);

        GrupoPessoas grupo = new GrupoPessoas();
        grupo.addPessoa(p1);
        grupo.addPessoa(p2);
        grupo.addPessoa(p3);
        grupo.addPessoa(p4);
        grupo.addPessoa(p5);

        HomemIterator homemIt = new HomemIterator(grupo);

        while (homemIt.hasNext()) {
            System.out.println(homemIt.next().nome);
        }

    }
}
