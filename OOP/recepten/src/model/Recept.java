package model;

import java.util.ArrayList;

public class Recept {
    private String naam;
    private ArrayList<Ingredient> ingredients;
    private BoodschappenLijst boodschappenLijst;

    public Recept(String naam) {
        this.naam = naam;
    }

    public int geefCalorieen() {
        return -1;
    }

    public void voegIngredientToe(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    private int berekenBenodigdeAantalProducten(Ingredient ingredient) {
        return -1;
    }
}
