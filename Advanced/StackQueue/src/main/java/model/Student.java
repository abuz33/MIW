package model;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;


/**
 * A <code>Student</code> holds the information for a student with a mark for an unknown course
 * at the HvA.</br>
 * Students have to create this class.
 * 
 * @author Nico Tromp
 */
public class Student implements Comparable<Student>{
    private static int nextStudentID = 500800001;
    private static final Random randomizer = new SecureRandom();
    private final int studentID;
    private final double mark;

    public Student() {
        studentID = nextStudentID++;
        mark = (10 + randomizer.nextInt(91)) / 10.0;
    }
    
    public static ArrayList<Student> generateStudents(int numberOfStudents) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            students.add(new Student());
        }
        return students;
    }
    
    public double getMark() {
        return mark;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    
    public String toString() {
        return String.format("{%9d, %.1f}", studentID, mark);
    }

    @Override
    public int compareTo(Student o) {
        return (int)(100 *(this.getMark() - o.getMark()));
    }
}
