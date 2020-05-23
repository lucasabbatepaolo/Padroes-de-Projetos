package br.com.lca.bridge;

public class Main {
    public static void main(String[] args) {
        Implementacao implPos = new ImpementacaoProfessorPos();
        Professor p = new ProfessorPos(implPos);

        p.info();
    }
}
