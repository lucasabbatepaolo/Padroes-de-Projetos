package br.com.lca.iterator;

import java.util.Iterator;

public class HomemIterator implements Iterator<Pessoa> {

    private GrupoPessoas grupo;
    int pos = 0;


    public HomemIterator(GrupoPessoas grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean hasNext() {
       for(int i = pos; i < grupo.getGrupoDePessoas().size(); i++) {
           Pessoa p = grupo.getGrupoDePessoas().get(i);
           if(p.genero.equals(Genero.MASCULINO)) {
               return true;
           }
       }
       return false;
    }

    @Override
    public Pessoa next() {
        while(pos < grupo.getGrupoDePessoas().size()) {
            Pessoa p = grupo.getGrupoDePessoas().get(pos);
            pos++;
            if(p.genero.equals(Genero.MASCULINO)) {
                return p;
            }
        }
        return null;
    }
}
