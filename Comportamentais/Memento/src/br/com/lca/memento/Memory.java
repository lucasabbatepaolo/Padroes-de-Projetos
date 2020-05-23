package br.com.lca.memento;

public class Memory {

    Memento memento;

    public void save(Pessoa pessoa) {
        memento = new Memento(pessoa.getNome(), pessoa.getIdade());

    }

    public void restore(Pessoa pessoa) {
        pessoa.setNome(memento.getNome());
        pessoa.setIdade(memento.getIdade());
    }
}
