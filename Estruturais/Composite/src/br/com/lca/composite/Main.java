package br.com.lca.composite;

public class Main {
    public static void main(String[] args) {
        Folder f1 = new Folder("root");
        Folder f2 = new Folder("home");
        Folder f3 = new Folder("lucas");

        Folder f4 = new Folder("projetos");

        f1.addSubFolder(f2);
        f1.addSubFolder(f3);

        f3.addSubFolder(f4);

        f1.write();


    }
}
