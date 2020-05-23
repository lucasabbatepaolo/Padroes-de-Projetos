package br.com.lca.proxy;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client(true);
        Client client2 = new Client(false);

        Internet internet = new Internet();

        Proxy proxy1 = new Proxy(internet, client1);
        proxy1.navegar();
        Proxy proxy2 = new Proxy(internet, client2);
        proxy2.navegar();

    }
}
