package controller;


import datastructures.ArrayListStack;
import datastructures.HeapPriorityQueue;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public Main() {
        super();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.print("Enter a word to check if it is Palindrome? ");
        String woord = "";
        if (scanner.hasNextLine()) {
            woord = scanner.nextLine();
        }
        main.runPalindroomTest(woord);
        main.runStudentPriorities();

    }

    private void runPalindroomTest(String woord) {
        // TODO: test of een woord een palindroom is
        // Voeg de letters van een woord toe aan een stack
        // Haal de letters van de stack en maak daarmee een nieuw woord
        // Als het nieuwe woord gelijk is aan het oorspronkelijke woord heb je een palindroom
        ArrayListStack<Character> arrayListStack = new ArrayListStack<>();
        for (char c : woord.toCharArray()) {
            arrayListStack.push(c);
        }
        StringBuilder newWord = new StringBuilder();
        while (!arrayListStack.isEmpty()) {
            newWord.append(arrayListStack.pop());
        }
        System.out.println(woord + " " + (woord.contentEquals(newWord) ? "is Palindroom!!!!" : "is not Palindroom!!!!"));
    }

    private void runStudentPriorities() {
        // TODO: Maak een priority queue en een lijst studenten, voeg de studenten toe aan de queue
        // Test of de studenten op volgorde uit de queue komen.
        List<Student> students = Student.generateStudents(25);
        HeapPriorityQueue<Student> heapPriorityQueue = new HeapPriorityQueue();
        for (Student s : students) {
            heapPriorityQueue.enqueue(s);
        }

        while (heapPriorityQueue.size() > 0) {
            System.out.println(heapPriorityQueue.dequeue());
        }
    }
}
