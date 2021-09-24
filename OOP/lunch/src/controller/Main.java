package controller;

public class Main {
    public static void main(String[] args) {

        String res = pigIt("Pig latin is cool ! ");
        System.out.println(res);
    }

    public static String pigIt(String str) {
        // Write code here
        String[] words = str.split(" ");
        String returnString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[\\p{Punct}\\s]+")) returnString += words[i];
            else {
                String firstPart = words[i].substring(1);
                String firstLetter = words[i].substring(0, 1);
                if (i != words.length) returnString += firstPart + firstLetter + "ay" + " ";
                else returnString += firstPart + firstLetter + "ay";
            }
        }
        return returnString;
    }
}
