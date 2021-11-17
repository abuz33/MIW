/**
 * Created by abuzer.alaca on 16/11/2021
 **/


package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(addUpto(10000));
        System.out.println(add(10000));
//        int sum = 0;
//        for (int i = 0; i <= 10000; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        System.out.println(makePasswordsRecursive(10, new char[]{'r', 'g', 'b'}));

        System.out.println(triangle(4));
        System.out.println(triangle(3));
    }

    private static int addUpto(int i) {
        if (i == 0) return 0;
        return i + addUpto(i - 1);
    }

    private static int add(int i) {
        return (i * (i + 1)) / 2;
    }

    private static List<String> makePasswordsRecursive(int length, char[] chars) {
        List<String> newPasswords = new ArrayList<>();
        if (length == 1) {
            for (char c : chars) {
                newPasswords.add(String.valueOf(c));
            }
            return newPasswords;
        }
        List<String> passwords = makePasswordsRecursive(length - 1, chars);
        for (String s : passwords) {
            for (char c : chars) {
                newPasswords.add(s + c);
            }
        }
        return newPasswords;
    }

    private static int triangle(int n) {
        if (n == 1) return n;
        return n + triangle(n - 1);
    }

}
