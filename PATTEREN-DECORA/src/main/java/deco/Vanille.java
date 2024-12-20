package deco;

import boissons.Boisson;

public class Vanille extends DecorateurBoisson{
    public Vanille(Boisson boisson) {
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



