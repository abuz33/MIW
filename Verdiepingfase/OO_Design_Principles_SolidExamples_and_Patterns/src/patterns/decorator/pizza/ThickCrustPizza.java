package patterns.decorator.pizza;

public class ThickCrustPizza extends Pizza {
  
	public ThickCrustPizza() {
		description = "Thick crust pizza, with tomato sauce";
	}
  
	public double cost() {
		return 7.99;
	}
}

