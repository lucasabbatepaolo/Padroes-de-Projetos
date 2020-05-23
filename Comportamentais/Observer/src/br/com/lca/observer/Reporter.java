package br.com.lca.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Reporter extends Observable {

    private String mensagem;
    List<Observer> observers;

    public Reporter(String mensagem) {
        this.mensagem = mensagem;
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Editor ed) {
        observers.add(ed);
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        this.observers.forEach(observer -> observer.update(this, mensagem));
    }
}
