package figurenenexception;

import controller.VerkeerdeInputException;

public class RechthoekLauncher {

    public static void main(String[] args) {
        // maak rechthoek
        try {
            Rechthoek rechthoek = new Rechthoek(-3,0);
        } catch (VerkeerdeInputException e) {
            e.printStackTrace();
        }
    }
}
