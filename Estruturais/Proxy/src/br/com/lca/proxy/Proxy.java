package br.com.lca.proxy;

public class Proxy {

    private Internet internet;
    private Client cliente;

    public Proxy(Internet internet, Client cliente) {
        this.internet = internet;
        this.cliente = cliente;
    }

    void navegar() {
        if (cliente.enable) {
            internet.navegar();
        }
    }
}
