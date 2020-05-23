package br.com.lca.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private List<Folder> subFolders = new ArrayList<Folder>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void write() {
        System.out.println(this.name);
        subFolders.forEach(n -> n.write() );

    }
}
