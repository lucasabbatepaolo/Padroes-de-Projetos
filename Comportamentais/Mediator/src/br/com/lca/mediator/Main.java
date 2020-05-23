package br.com.lca.mediator;

public class Main {

    public static void main(String[] args) {

        Mediator controle = new Mediator();
        MesaDeAtendimento mesa1 = new MesaDeAtendimento("Mesa 1", controle);
        MesaDeAtendimento mesa2 = new MesaDeAtendimento("Mesa 2", controle);

        SenhaDeAtendimento senha1 = new SenhaDeAtendimento(1 ,false);
        SenhaDeAtendimento senha2 = new SenhaDeAtendimento(2 ,false);
        SenhaDeAtendimento senha3 = new SenhaDeAtendimento(3 ,true);
        SenhaDeAtendimento senha4 = new SenhaDeAtendimento(4 ,true);
        SenhaDeAtendimento senha5 = new SenhaDeAtendimento(5 ,false);

        controle.colocarNaFila(senha1);
        controle.colocarNaFila(senha2);
        controle.colocarNaFila(senha3);
        controle.colocarNaFila(senha4);
        controle.colocarNaFila(senha5);

        mesa1.chamarProximaSenha();
        mesa2.chamarProximaSenha();
        mesa1.chamarProximaSenha();
        mesa2.chamarProximaSenha();
        mesa1.chamarProximaSenha();


    }
}

