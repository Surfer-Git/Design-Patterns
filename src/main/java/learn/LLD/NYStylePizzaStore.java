package learn.LLD;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new CheesePizza();
        }
        else if(type.equals("Pepperoni")){
            return new PepperoniPizza();
        }
        else{
            return new VeggiePizza();
        }
    }
}
