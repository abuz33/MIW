import java.util.Comparator;

public class ComparatorClass {
    public static class CompareById implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getStudentID() - o2.getStudentID();
        }
    }

    public static class CompareByCijfer implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return  (int) ((o1.getMark() - o2.getMark()) * 10);
        }
    }

    public static class CompareByCijferEnId implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getMark() - o2.getMark() != 0) {
                return (int) (o1.getMark() - o2.getMark());
            } else {
                return o1.getStudentID() - o2.getStudentID();
            }
        }
    }
}
