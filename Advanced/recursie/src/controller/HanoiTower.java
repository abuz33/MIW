package controller;


public class HanoiTower {
    public static void main(String[] args) {
        hanoiTowerSolution(4, "A", "B", "C");
    }

    public static void hanoiTowerSolution(int n, String source, String temp, String destination) {
        if (n == 0) return;
        hanoiTowerSolution(n - 1, source, destination, temp);
        System.out.printf("\n%s disk (%s --> %s)", n, source, destination);
        printHanoi(n, source, destination);
        hanoiTowerSolution(n - 1, temp, source, destination);
    }

    private static void printHanoi(int n, String source, String destination) {

    }
}

