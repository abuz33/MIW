package patterns.command.lunchroom;

/**
 * Reciever: kok weet de 'businesslogic' van het koken.
 */
public class Kok {

	public Kok() {}

	public void makeBurger() {
		System.out.println("Making a burger");
	}

	public void makeFries() {
		System.out.println("Making fries");
	}
}