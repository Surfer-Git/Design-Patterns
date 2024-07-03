package learn.LLD.pizzas;

import learn.LLD.factories.IngridientFactory;

public class CheesePizza extends Pizza {
    IngridientFactory ingridientFactory;

    public CheesePizza(IngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        sauce = ingridientFactory.createSauce();
        dough = ingridientFactory.createDough();
        System.out.println("preparing Cheese Pizza");
        System.out.println("having dough: " + dough.getClass().getSimpleName());
        System.out.println("with sauce: " + sauce.getClass().getSimpleName());
    }
}
