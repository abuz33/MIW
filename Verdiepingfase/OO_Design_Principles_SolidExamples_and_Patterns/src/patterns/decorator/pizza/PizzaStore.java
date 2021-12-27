package patterns.decorator.pizza;

public class PizzaStore {

    public static void main(String args[]) {
        Pizza pizza = new ThincrustPizza();
        Pizza tomato = new TomatoSauce(pizza);
        Pizza cheesePizza = new Cheese(tomato);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription()
                + " $" + greekPizza.cost());

    }
}
