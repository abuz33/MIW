package controller;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.oppervlakte());
        System.out.println(rectangle.toString());

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            nums.add(i);
        }

        Collections.shuffle(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+" ");
        }
    }
}
