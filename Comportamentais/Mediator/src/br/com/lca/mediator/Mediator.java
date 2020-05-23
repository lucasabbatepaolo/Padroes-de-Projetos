package br.com.lca.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<SenhaDeAtendimento> fila;
    private List<SenhaDeAtendimento> filaPreferencial;

    public Mediator() {
        this.fila = new ArrayList<SenhaDeAtendimento>();
        this.filaPreferencial = new ArrayList<SenhaDeAtendimento>();
    }

    public void colocarNaFila(SenhaDeAtendimento senha) {
        if(senha.isPreferencial()) {
            filaPreferencial.add(senha);
        } else {
            fila.add(senha);
        }

    }

    public void chamarProximo() {
        if (filaPreferencial.size() > 0){
            SenhaDeAtendimento senha = filaPreferencial.get(0);
            System.out.println("Senha: " + senha.getNumero());
            filaPreferencial.remove(senha);
        } else if(fila.size() > 0){
            SenhaDeAtendimento senha = fila.get(0);
            senha = fila.get(0);
            System.out.println("Senha: " + senha.getNumero());
            fila.remove(senha);
        }
    }
}
