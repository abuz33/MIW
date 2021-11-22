package controller;

import model.StudentResult;
import model.Vakken;

public class VakLauncher {
    public static void main(String[] args) {
//        Vakken vakken = new Vakken();
//        vakken.printVakcodes();
//        vakken.printEcts();
//        vakken.printVakEnECTSSorteerd();
        StudentResult sr = new StudentResult();
//        sr.printStudentEnVakken();
        sr.printStudentEnTotaalEcts();
    }
}
