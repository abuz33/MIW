package figurenenexception;

import controller.VerkeerdeInputException;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) throws VerkeerdeInputException {
        // check input parameters. throw een gepaste exception als negatief of 0 is
        if(lengte <=0 || breedte <=0){
            // exception throwen: throw geen illegalargumentexception, maar maak een eigen Checked exception.
            // deze MOET afgehandeld worden door de aanroepende code.
            throw new VerkeerdeInputException("lengte of breedte is foutief.");
        }

        // wat is een 'gepaste exception'??
        // waar zou ik dat kunnen vinden?

        // eeehhhhh, wellicht javadoc?
        // er zijn 'exceptions', 'errors' en 'runtimeexceptions'

        // als alles goed is: zet de waarden.
        this.lengte = lengte;
        this.breedte = breedte;
    }
}
