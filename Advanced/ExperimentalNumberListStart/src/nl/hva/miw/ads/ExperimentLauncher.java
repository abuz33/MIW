package nl.hva.miw.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentLauncher {

    public static void main(String[] args) {
        // Write your own main method.


        // Example
        ExperimentalNumberList exList = new ExperimentalNumberList(20);
        exList.generateNumbers(-10, 10);
        System.out.println(exList);
        System.out.printf("Positives : %-4s\tSumPos: %-4s\tMax:%-4s\tDifferent:%-4s\tnumberLocalMax: %-4s\n", exList.countPositives(),
                exList.sumOfPositives(),
                exList.maxValue(),
                exList.numberOfDifferentValues(),
                exList.numberOfLocalMaximum());

        for (ExperimentalNumberList ex : generateList(100, 50, -100, 100)) {
            System.out.printf("Positives : %-4s\tSumPos: %-4s\tMax:%-4s\tDifferent:%-4s\tnumberLocalMax: %-4s\n",ex.countPositives(), ex.sumOfPositives(),ex.maxValue(),ex.numberOfDifferentValues(),ex.numberOfLocalMaximum());
        }

    }

    public static List<ExperimentalNumberList> generateList(int numberOfList, int numberOfElements, int min, int max) {
        List<ExperimentalNumberList> numberLists = new ArrayList<>();
        for (int i = 0; i < numberOfList; i++) {
            ExperimentalNumberList exList = new ExperimentalNumberList(numberOfElements);
            exList.generateNumbers(min, max);
            numberLists.add(exList);
        }
        return numberLists;
    }
}
