import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentLauncher {
    public static void main(String[] args) {
        List<Student> unsorteerdStudentList1 = generateStudent(50);
        Comparator<Student> compareId = new ComparatorClass.CompareById();
        Comparator<Student> compareCijfer = new ComparatorClass.CompareByCijfer();
        Comparator<Student> compareCijferEnId = new ComparatorClass.CompareByCijferEnId();

        System.out.println("--------- Unsorteerd ------------");
        for (Student s : unsorteerdStudentList1) {
            printStudent(s);
        }
        System.out.println("--------- Compared By Id ------------");
        compareEnPrint(unsorteerdStudentList1, compareId);

        System.out.println("--------- Compare By Mark ------------");
        compareEnPrint(unsorteerdStudentList1, compareCijfer);

        System.out.println("--------- Compare By Mark en Id ------------");
        compareEnPrint(unsorteerdStudentList1, compareCijferEnId);
    }

    private static void compareEnPrint(List<Student> list, Comparator<Student> comparator) {
        Collections.sort(list, comparator);
        for (Student s : list) {
            printStudent(s);
        }
    }

    public static void printStudent(Student student) {
        System.out.printf("Student Id : %-9s\tStudent Mark: %2.1f\n", student.getStudentID(), student.getMark());
    }

    private static List<Student> generateStudent(int number) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            students.add(new Student());
        }
        return students;
    }
}
