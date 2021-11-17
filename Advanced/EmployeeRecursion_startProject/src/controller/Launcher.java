package controller;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.run();
    }

    private void run() {
        // Initialise the Employees
        Employee jim = new Employee("Jim");
        Employee mats = new Employee("Mats");
        Employee frida = new Employee("Frida");
        Employee lena = new Employee("Lena");
        Employee elsa = new Employee("Elsa");
        Employee bjorn = new Employee("Bjorn");

        // Make a list of the Employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(jim);
        employeeList.add(mats);
        employeeList.add(frida);
        employeeList.add(lena);
        employeeList.add(elsa);
        employeeList.add(bjorn);

        // set the manager of the employees
        jim.setManager(mats);
        mats.setManager(frida);
        lena.setManager(jim);
        elsa.setManager(frida);
        bjorn.setManager(jim);


        System.out.println("-----------------------");
        for (Employee employee : employeeList) {
            System.out.println(employee.showManagersBottomUp());
        }

        System.out.println("-----------------------");
        for (Employee employee : employeeList) {
            System.out.println(employee.showManagersTopDown());
        }

        System.out.println("-----------------------");
        frida.printEmployees(1);
    }
}


