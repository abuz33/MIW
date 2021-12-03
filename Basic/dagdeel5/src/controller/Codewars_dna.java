package controller;

public class Codewars_dna {
    public static void main(String[] args) {
        String dna = "ATGCAT";
        String newDNA = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.substring(i, i + 1).equals("A")) newDNA += "T";
            else if (dna.substring(i, i + 1).equals("T")) newDNA += "A";
            else if (dna.substring(i, i + 1).equals("G")) newDNA += "C";
            else if (dna.substring(i, i + 1).equals("C")) newDNA += "G";
        }
        System.out.println(newDNA);

        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(whoLikesIt("Alex", "Jacob"));
        System.out.println(greedy(new int[]{5,1,3,4,1}));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int population = p0;
        double procent = (100 + percent) / 100;
        for (int i = 0; i < Math.pow(2, 20); i++) {
            population = (int) (population * procent + aug);
            if (population > p) return i + 1;
        }
        return 1;
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        if (names.length <= 0) return "no one likes this";
        else if (names.length == 1) return String.format("%s likes this", names[0]);
        else if (names.length == 2) return String.format("%s and %s likes this", names[0], names[1]);
        else if (names.length == 3) return String.format("%s, %s and %s likes this", names[0], names[1], names[2]);
        else if (names.length >= 4) return String.format("%s, %s and %s other likes this", names[0], names[1], names.length -2);
        else return "";
    }

    public static int greedy(int[] dice){
        //code here
        int ones = 0,twos=0,threes=0, fours=0,fives=0, sixes=0, total=0;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1 ) {
                ones +=1;
                if (ones ==3){
                    ones = 0;
                    total += 1000;
                }
            } else if (dice[i] == 5 ) {
                fives +=1;
                if (fives ==3){
                    fives =0;
                    total += 500;
                }
            }
            else if (dice[i] == 2 ) twos +=1;
            else if (dice[i] == 3 ) threes +=1;
            else if (dice[i] == 4 ) fours +=1;
            else if (dice[i] == 6 ) sixes +=1;
        }

        if (twos >= 3) total += 200;
        if (threes >= 3) total += 300;
        if (fours >= 3) total +=400;
        if (sixes >= 3) total += 600;
        total += ones * 100 + fives *50;

        return total;
    }
}
