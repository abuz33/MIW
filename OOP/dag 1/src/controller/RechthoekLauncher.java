package controller;
import model.exceptions.NullOfNegatiefException;
import model.shapes.Rechthoek;

public class RechthoekLauncher {
    public static void main(String[] args){
        try {
            Rechthoek r1 = new Rechthoek(-1,-11);
        } catch (NullOfNegatiefException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
