package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Vakken {
    Map<String, Integer> vakken;

    public Vakken() {
        vakken = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("src/resources/vakcodes.txt"));) {
            while (scanner.hasNextLine()) {
                String regel = scanner.nextLine();
                String[] vakECTS = regel.split("\\s+");
                vakken.put(vakECTS[0], Integer.valueOf(vakECTS[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getECTS(String vak) {
        return vakken.get(vak);
    }

    public void printVakcodes() {
        for (String s : vakken.keySet()) {
            System.out.println(s);
        }
    }

    public void printEcts() {
        for (int s : vakken.values()) {
            System.out.println(s);
        }
    }

    public void printTotaalEcts() {
        int totaal = 0;
        for (int s : vakken.values()) {
            totaal += s;
        }

        System.out.println("Totaal Van all ECTS :" + totaal);
    }

    public void printVakEnECTS() {
        for (Map.Entry<String, Integer> a : vakken.entrySet()) {
            System.out.printf("Vak Code : %-7s\tECTS: %-2s\n", a.getKey(), a.getValue());
        }
    }

    public void printVakEnECTSSorteerd() {
        List<String> vakkens = new ArrayList<>(this.vakken.keySet());
        Collections.sort(vakkens);
        for (String vak : vakkens) {
            System.out.printf("Vak Code : %-7s\tECTS: %-2s\n", vak, this.vakken.get(vak));
        }
    }
}
