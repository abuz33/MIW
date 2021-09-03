package controller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char[][] spelbord = new char[3][3];
        char SPELLER_HUMAN = 'X';
        char SPELLER_COMPUTER = 'O';
        Random random = new Random();

        resetBoard(spelbord);

        Scanner scanner = new Scanner(System.in);

        int turn = 0;
        char winner = ' ';
        char currenPlayer = 'X';

        while (turn < 9) {
            int column = 0;
            int row = 0;

            while (true) {
                System.out.print("Choose a row in the bord(between 0 and 2) ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                } else System.out.println("Please Enter a number!!");
                scanner.nextLine();
                System.out.print("Choose a column in the bord(between 0 and 2) ");
                if (scanner.hasNextInt()) {
                    column = scanner.nextInt();
                } else System.out.println("Please Enter a number!!");
                scanner.nextLine();

                if (row > 2 || column > 2) {
                    System.out.println("Please choose a Valid position!!!!");
                    continue;
                }
                if (isValidMove(row, column, spelbord)) break;
                System.out.println("Please choose a Valid position!!!!");
            }


            spelbord[row][column] = currenPlayer;

            currenPlayer = changePlayer(currenPlayer);
//            printBoard(spelbord);
//            if (checkBord(spelbord)) {
//                System.out.print("Congrats Player won.");
//                break;
//            }

//            System.out.println("Computers Turn.");
//            int[] places = computerTurn(random);

//            while (true) {
//                if (isValidMove(places[0], places[1], spelbord)) break;
//                else places = computerTurn(random);
//            }
//            spelbord[places[0]][places[1]] = SPELLER_COMPUTER;

            printBoard(spelbord);

            if (checkBord(spelbord)) {
                if (turn % 2 == 0) System.out.print("Congrats!!! Speller A won.");
                else System.out.println("Congrats!! Speller B won");
                break;
            }

            if (currenPlayer == 'O') {

                turn++;
            }
            if (turn == 9) {
                System.out.println("It is a Tie Goog luck");
            }
        }
    }

    private static int[] computerTurn(Random random) {
        int[] places = new int[2];
        places[0] = random.nextInt(3);
        places[1] = random.nextInt(3);
        return places;
    }

    private static char changePlayer(char currenPlayer) {
        char currenPlayer1;
        if (currenPlayer == 'X') currenPlayer1 = 'O';
        else currenPlayer1 = 'X';
        return currenPlayer1;
    }

    private static void resetBoard(char[][] spelbord) {
        for (int i = 0; i < spelbord.length; i++) {
            for (int j = 0; j < spelbord[0].length; j++) {
                spelbord[i][j] = '-';
            }
        }
    }

    private static boolean isValidMove(int row, int column, char[][] spelbord) {
        if (spelbord[row][column] != '-') return false;
        else if (spelbord[row][column] == 'X' || spelbord[row][column] == 'O') return false;
        else return true;
    }

    private static void printBoard(char[][] spelbord) {
        System.out.printf("    0   1   2  \n---------------\n0 | %s | %s | %s |\n---------------\n1 | %s | %s | %s |\n---------------\n2 | %s | %s | %s |\n---------------\n",
                spelbord[0][0],
                spelbord[0][1],
                spelbord[0][2],
                spelbord[1][0],
                spelbord[1][1],
                spelbord[1][2],
                spelbord[2][0],
                spelbord[2][1],
                spelbord[2][2]);
    }

    private static boolean checkBord(char[][] spelbord) {
        for (int i = 0; i < spelbord.length; i++) {
            // vertical check
            if (spelbord[0][i] == spelbord[1][i] && spelbord[0][i] == spelbord[2][i] && spelbord[2][i] != '-')
                return true;
                // horizontal check
            else if (spelbord[i][0] == spelbord[i][1] && spelbord[i][0] == spelbord[i][2] && spelbord[i][0] != '-')
                return true;
        }
        // Diagonal check
        if (spelbord[0][0] == spelbord[1][1] && spelbord[0][0] == spelbord[2][2] && spelbord[2][2] != '-')
            return true;
        else if (spelbord[0][2] == spelbord[1][1] && spelbord[0][2] == spelbord[2][0] && spelbord[2][0] != '-')
            return true;
        return false;
    }

}
