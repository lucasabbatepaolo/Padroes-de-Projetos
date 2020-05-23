package br.com.lca.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> comandos = new ArrayList<Command>();

    public void execute(Command command) {
        command.excecutar();
        comandos.add(command);
    }

    public void desfazer() {
        Command c = comandos.get(comandos.size()-1);
        c.desfazer();
        comandos.remove(c);
    }

}
