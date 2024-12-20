package org.example;

import boissons.Boisson;
import boissons.Sumatra;
import deco.Chantilly;
import deco.Chocolat;
import deco.Noisette;
import deco.Vanille;

import java.io.*;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args, Object doc) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.print(boisson.getDescription());
        System.out.print(boisson.cout() );
        boisson = new Chocolat(boisson);
        System.out.println("----------------------");
        System.out.print(boisson.cout() );
        System.out.print(boisson.getDescription());
        System.out.println("----------------------");

        boisson = new Chocolat(boisson);
        System.out.println("----------------------");
        System.out.print(boisson.cout() );
        System.out.print(boisson.getDescription());
        System.out.println("----------------------");

        boisson = new Noisette(boisson);
        System.out.println("----------------------");
        System.out.print(boisson.cout() );
        System.out.print(boisson.getDescription());
        System.out.println("----------------------");

        boisson = new Chantilly(boisson);
        System.out.println("----------------------");
        System.out.print(boisson.cout() );
        System.out.print(boisson.getDescription());
        System.out.println("----------------------");
        System.out.println("--------------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("*************");

        Boisson b = new Vanille(new Chocolat(new Noisette(new Chocolat(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());


        InputStream is = new BufferedInputStream(new ZipInputStream(new ZipInputStream(new ZipInputStream(new FileInputStream("new File ("dec.zip")))));
}
}