/**
 * Created by abuzer.alaca on 17/12/2021
 **/


package patterns.decorator.pizza;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 0.60;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
