package br.com.lca.memento;

public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas", 35);

        Memory memory = new Memory();
        memory.save(p);

        p.setNome("João");
        p.setIdade(22);

        System.out.println(p.getNome());

        memory.restore(p);
        System.out.println(p.getNome());


    }
}
