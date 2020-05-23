package br.com.lca.observer;

public class Main {

    public static void main(String[] args) {
        Reporter r1 = new Reporter("");

        Editor editor1 = new Editor("Editor 1 ", r1);
        Editor editor2 = new Editor("Editor 2 ", r1);
        Editor editor3 = new Editor("Editor 3 ", r1);

        r1.addObserver(editor1);
        r1.addObserver(editor2);
        r1.addObserver(editor3);

        r1.setMensagem("Nova materia sobre desenvolvimento de software");

    }
}
