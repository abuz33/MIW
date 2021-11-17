/**
 * Created by abuzer.alaca on 17/11/2021
 **/


package controller;

public class Sommeer {
    public static void main(String[] args) {
        System.out.println(sommeerArray(new int[]{2, 4, 6, 1, 0, 9}));

    }

    public static int sommeerArray(int[] intArray) {
        return intArray[0] + sommeerArray(intArray, 1);
    }

    private static int sommeerArray(int[] intArray, int place) {
        if (place == intArray.length) return 0;
        return intArray[place] + sommeerArray(intArray, place + 1);
    }

    private static int sommeerArrayLoop(int[] intArray) {
        int sum = 0;
        for (int j : intArray) {
            sum += j;
        }
        return sum;
    }

}
