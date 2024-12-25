package org.example;

import comp.Component;
import comp.File;
import comp.Folder;

public class  Main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addChild(new File("pom.xml"));
        Folder src = (Folder) root.addChild(new Folder("src"));
        Folder main = (Folder) src.addChild(new Folder("main"));
        main.addChild(new File("Test.java"));
        main.addChild(new File("Person.java"));
        root.print();
    }
}