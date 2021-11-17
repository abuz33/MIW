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
        int sum = 0;
        for (int i = 0; i <= 10000; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println(makePasswordsRecursive(10, new char[]{'r', 'g', 'b'}));
    }

    private static int addUpto(int i) {
        if (i == 0) return 0;
        return i + addUpto(i - 1);
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

}
