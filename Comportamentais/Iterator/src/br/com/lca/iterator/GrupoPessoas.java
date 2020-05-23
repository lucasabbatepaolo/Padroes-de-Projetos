package br.com.lca.iterator;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoas {

    List<Pessoa> grupoDePessoas;

    public GrupoPessoas() {
        grupoDePessoas = new ArrayList<Pessoa>();
    }

    public void addPessoa(Pessoa pessoa) {
        grupoDePessoas.add(pessoa);
    }

    public List<Pessoa> getGrupoDePessoas() {
        return grupoDePessoas;
    }
}
