package patterns.command.lunchroom;

public class LunchRoom {
	public static void main(String[] args) {
		Kok kok = new Kok();
		Serveerster serveerster = new Serveerster();

		// klant in lunchroom
		Klant klant = new Klant(serveerster);

		// creer order die door kok uitgevoerd gaat worden.
		klant.createOrder(new BurgerAndFriesOrder(kok));

		//
		klant.giveOrderToServeerster();
	}
}