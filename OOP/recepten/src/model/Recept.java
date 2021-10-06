package model;

import java.util.ArrayList;

public class Recept {
    private String naam;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private BoodschappenLijst boodschappenLijst;

    public Recept(String naam) {
        this.naam = naam;
        boodschappenLijst = new BoodschappenLijst();
    }

    public String getNaam() {
        return naam;
    }

    public int geefCalorieen() {
        int totaal = 0;
        for (Ingredient i : ingredients) {
            totaal += i.geefCalorieen();
        }
        return totaal;
    }

    public void voegIngredientToe(Ingredient ingredient) {
        ingredients.add(ingredient);
        berekenBenodigdeAantalProducten(ingredient);
    }

    public BoodschappenLijst getBoodschappenLijst() {
        return boodschappenLijst;
    }

    private int berekenBenodigdeAantalProducten(Ingredient ingredient) {
        int aantalProduct = (int) Math.ceil(1.0 * ingredient.hoeveelheidInGram / ingredient.getWinkelProduct().getVerkoopHoeveelheidInGram());

        for (int i = 0; i < aantalProduct; i++) {
            boodschappenLijst.voegProductToe(ingredient.getWinkelProduct());
        }
        return aantalProduct;
    }

    @Override
    public String toString() {
        return "Recept{" +
                "naam='" + naam + '\'' +
                ", ingredients=" + ingredients +
                ", boodschappenLijst=" + boodschappenLijst +
                '}';
    }
}
