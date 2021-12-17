package patterns.command.lunchroom;

/**
 * Client class
 */
public class Klant {
	Serveerster serveerster;
	Order order;
	public Klant(Serveerster serveerster) {
		this.serveerster = serveerster;
	}
	public void createOrder(Order order) {
		this.order = order;
	}

	public void giveOrderToServeerster() {
		serveerster.takeOrder(order);
	}
}