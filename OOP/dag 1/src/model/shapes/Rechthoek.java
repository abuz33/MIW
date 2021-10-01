package model.shapes;

import model.exceptions.NullOfNegatiefException;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) throws NullOfNegatiefException {
        if (lengte <= 0 || breedte <= 0) {
            throw new NullOfNegatiefException("lengte of breedte kunt geen negatief of null zijn");
        } else {
            this.lengte = lengte;
            this.breedte = breedte;
        }
    }

}
