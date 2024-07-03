package learn.LLD;

import learn.LLD.factories.impl.NYIngredientFactory;
import learn.LLD.pizzas.CheesePizza;
import learn.LLD.pizzas.PepperoniPizza;
import learn.LLD.pizzas.Pizza;
import learn.LLD.pizzas.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new CheesePizza(new NYIngredientFactory());
        }
        else if(type.equals("Pepperoni")){
            return new PepperoniPizza();
        }
        else{
            return new VeggiePizza();
        }
    }
}
