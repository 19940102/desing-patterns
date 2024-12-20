package deco;

import boissons.Boisson;

public abstract class DecorateurBoisson extends  Boisson {
    protected Boisson boisson;

    @Override
    public  abstract  String getDescription();
    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
