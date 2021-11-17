/**
 * Created by abuzer.alaca on 17/11/2021
 **/


package controller;

public class Macht {
    public static void main(String[] args) {
        System.out.println(exponent(150, 5));
    }

    private static int exponent(int basis, int exponent) {
        if (exponent == 0) return 1;
        return basis * exponent(basis, exponent - 1);
    }
}
