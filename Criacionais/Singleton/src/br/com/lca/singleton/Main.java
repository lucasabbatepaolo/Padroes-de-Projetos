package br.com.lca.singleton;

public class Main {

    public static void main (String a[]) {
        Main run = new Main();
        run.execute();
    }

    private void execute() {
        System.out.println(StringConexao.getUrlConexao());

        StringConexao stringConexao1 = new StringConexao();
        System.out.println(stringConexao1.getUrlConexao());
        StringConexao stringConexao2 = new StringConexao();
        System.out.println(stringConexao2.getUrlConexao());
    }
}
