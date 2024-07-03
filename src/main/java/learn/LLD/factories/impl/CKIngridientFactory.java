package learn.LLD.factories.impl;

import learn.LLD.factories.IngridientFactory;
import learn.LLD.ingredients.Dough;
import learn.LLD.ingredients.Sauce;
import learn.LLD.ingredients.impl.MarinaraSauce;
import learn.LLD.ingredients.impl.ThickCrust;

public class CKIngridientFactory implements IngridientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrust();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
