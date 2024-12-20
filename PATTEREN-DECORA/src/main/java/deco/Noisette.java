package deco;

import boissons.Boisson;

public class Noisette extends DecorateurBoisson{
    public Noisette(Boisson boisson) {

        super(boisson);
    }


    @Override
    public String getDescription() {

        return boisson.getDescription() + "au  Noisette" ;
    }

    @Override
    public double cout(){

        return  1.6+ boisson.cout();
    }
}



