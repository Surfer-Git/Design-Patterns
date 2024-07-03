package learn.LLD.factories;

import learn.LLD.ingredients.Dough;
import learn.LLD.ingredients.Sauce;

public interface IngridientFactory {
    Dough createDough();
    Sauce createSauce();
}
