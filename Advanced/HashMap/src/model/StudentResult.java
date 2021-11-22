package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentResult {
    Map<Integer, List<String>> studentResulten;
    Vakken vakken;

    public StudentResult() {
        vakken = new Vakken();
        studentResulten = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("src/resources/studentresults.txt"));) {
            while (scanner.hasNextLine()) {
                String regel = scanner.nextLine();
                String[] vakECTS = regel.split("\\s+");
                if (studentResulten.containsKey(Integer.parseInt(vakECTS[0]))) {
                    studentResulten.get(Integer.parseInt(vakECTS[0])).add(vakECTS[1]);
                } else {
                    studentResulten.put(Integer.parseInt(vakECTS[0]), new ArrayList<>(Collections.singleton(vakECTS[1])));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param studentId student Id
     * @return int
     * @should calculate number of Followed lesson
     */
    public int numberOfFollowedLessons(int studentId) {
        return studentResulten.get(studentId).size();
    }

    public void printStudentEnVakken() {
        for (Map.Entry<Integer, List<String>> s : studentResulten.entrySet()) {
            StringBuilder a = new StringBuilder("[");
            for (String b : s.getValue()) {
                if (a.length() != 1) {
                    a.append(",");
                }
                a.append(b);
            }
            a.append("]");
            System.out.printf("StudentId : %-5s\tVakken: %-60s\tNumber of followed Lesson: %s\n", s.getKey(), a, s.getValue().size());
        }
    }

    public void printStudentEnTotaalEcts() {
        for (Map.Entry<Integer, List<String>> s : studentResulten.entrySet()) {
            int totaalEcts = 0;
            for (String b : s.getValue()) {
                totaalEcts += vakken.getECTS(b);
            }
            System.out.printf("StudentId : %-5s\tECTS: %-6s\n", s.getKey(), totaalEcts);
        }
    }
}
