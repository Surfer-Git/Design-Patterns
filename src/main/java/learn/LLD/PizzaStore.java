package learn.LLD;

public class PizzaStore {
    private final PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.pack();
        pizza.parcel();
    }

}
