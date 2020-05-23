package br.com.lca.observer;

import java.util.Observable;
import java.util.Observer;

public class Editor implements Observer {

    private String name;


    public Editor(String name, Reporter reporter) {
    
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + " notificado");
    }
}
