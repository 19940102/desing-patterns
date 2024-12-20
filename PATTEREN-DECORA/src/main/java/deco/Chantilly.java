package deco;

import boissons.Boisson;

public class Chantilly extends DecorateurBoisson{
    public Chantilly(Boisson boisson) {
        super(boisson);
    }


    @Override
    public String getDescription() {
        return boisson.getDescription() + "au  Chantilly" ;
    }

    @Override
    public double cout(){
        return  1.2 + boisson.cout();
    }
}



