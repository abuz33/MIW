package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        WordMap wordMap = new WordMap();
//        wordMap.readFromFile("src/resources/input.txt");
//
//        for (String key : wordMap.getWoorden().keySet()) {
//            System.out.printf("Woord: %-15s \tAantal: %-2s\n", key, wordMap.getWordCount(key));
//        }
//
//        System.out.println();
//        System.out.println("Het Regel nummer");
//        System.out.println("_______________________________");
//
//        WordMapRegelTeller wordMapRegelTeller = new WordMapRegelTeller();
//        wordMapRegelTeller.readFromFile("src/resources/input.txt");
//        for (String key : wordMapRegelTeller.getWoorden().keySet()) {
//            StringBuilder s = new StringBuilder();
//            StringBuilder plaats = new StringBuilder();
//            for (int i = 0; i < wordMapRegelTeller.getRegels(key).size(); i++) {
//                if (i == wordMapRegelTeller.getRegels(key).size() - 1) {
//                    plaats.append(wordMapRegelTeller.getRegels(key).get(i));
//                } else plaats.append(wordMapRegelTeller.getRegels(key).get(i)).append(", ");
//            }
//            s.append(String.format("Woord : %-15s \tRegel:[%-150s]\tAantal: %2s", key, plaats.toString(), wordMapRegelTeller.getRegels(key).size()));
//            System.out.println(s);
//        }

//        System.out.println("Totaal Woorden in de text is " + wordMapRegelTeller.getTotalNrOfWords());

        System.out.println(toRoman(2521));
        System.out.println(fromRoman("MMCMXCIX"));
    }

    static Map<Character, Integer> romanString = new HashMap<>();
    static TreeMap<Integer, String> roman = new TreeMap<>();

    static {
        romanString.put('M', 1000);
        romanString.put('D', 500);
        romanString.put('C', 100);
        romanString.put('L', 50);
        romanString.put('X', 10);
        romanString.put('V', 5);
        romanString.put('I', 1);
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");
    }


    public static int fromRoman(String romanNumaral) {
        int number = 0;
        for (int i = 0; i < romanNumaral.length(); i++) {
            if (romanNumaral.length() == i + 1 || romanString.get(romanNumaral.charAt(i)) >= romanString.get(romanNumaral.charAt(i + 1))) {
                number += romanString.get(romanNumaral.charAt(i));
            } else {
                number -= romanString.get(romanNumaral.charAt(i));
            }
        }
        return number;
    }

    public static String toRoman(int number) {
        int l = roman.floorKey(number);
        if (number == l) {
            return roman.get(number);
        }
        return roman.get(l) + toRoman(number - l);
    }
}
