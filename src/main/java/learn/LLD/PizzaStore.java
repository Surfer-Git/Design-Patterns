package learn.LLD;

public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.pack();
        pizza.parcel();
    }

    public abstract Pizza createPizza(String type);

}
