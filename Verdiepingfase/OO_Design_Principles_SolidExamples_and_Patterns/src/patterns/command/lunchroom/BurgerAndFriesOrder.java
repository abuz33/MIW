package patterns.command.lunchroom;

/**
 * concrete command implementation
 */
public class BurgerAndFriesOrder implements Order {
	Kok kok;
	public BurgerAndFriesOrder(Kok kok) {
		this.kok = kok;
	}
	public void execute() {
		kok.makeBurger();
		kok.makeFries();
	}
}
