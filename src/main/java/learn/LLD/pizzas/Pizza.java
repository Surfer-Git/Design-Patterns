package learn.LLD.pizzas;

import learn.LLD.ingredients.Dough;
import learn.LLD.ingredients.Sauce;

public abstract class Pizza {
    Dough dough;
    Sauce sauce;

    public abstract void prepare();

    public void pack(){
        System.out.println("packing pizza");
    }
    public void parcel(){
        System.out.println("parcel ready :)");
    }
}
