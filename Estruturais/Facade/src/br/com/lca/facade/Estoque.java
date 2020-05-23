package br.com.lca.facade;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> listaDeProdutos = new ArrayList<Produto>();

    protected void addProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void listar() {
        listaDeProdutos.forEach(n -> System.out.println(n.getNome()));
    }
}
