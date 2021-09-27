package launcher;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

public class Main {
    public static void main(String[] args) {
        SnelheidsBoete jan = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 140, 80);
        System.out.println("👉"+jan);

        ParkeerBoete jan2 = new ParkeerBoete("Jan Smit", "04-SPZ-8", 2);
        System.out.println("👉🏻"+jan2);

        VerkeersBoete jan3 = new VerkeersBoete("Jan Smit", "04-SPZ-8", 102);
        System.out.println("👉"+jan3);
    }
}
