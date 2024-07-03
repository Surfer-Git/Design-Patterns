package learn.LLD;

public class PizzaFactory {
    public Pizza createPizza(String type){
        if(type.equals("Cheese")){
            return new CheesePizza();
        }
        else if(type.equals("Pepperoni")){
            return  new PepperoniPizza();
        }
        else{
            return new VeggiePizza();
        }
    }
}
