package patterns.command.lunchroom;

/**
 * Invoker class
 */
public class Serveerster {
	Order order;
	public Serveerster() {}

	/**
	 * take order en laat order uitvoeren.
	 * @param order
	 */
	public void takeOrder(Order order) {
		this.order = order;
		order.execute();
	}
}