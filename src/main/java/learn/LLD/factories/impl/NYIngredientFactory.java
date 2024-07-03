package learn.LLD.factories.impl;

import learn.LLD.factories.IngridientFactory;
import learn.LLD.ingredients.Dough;
import learn.LLD.ingredients.Sauce;
import learn.LLD.ingredients.impl.BBQsauce;
import learn.LLD.ingredients.impl.ThinCrust;

public class NYIngredientFactory implements IngridientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BBQsauce();
    }
}
