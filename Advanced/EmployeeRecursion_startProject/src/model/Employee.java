package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private Employee manager;
    private List<Employee> managedEmployees = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
        manager.managedEmployees.add(this);
    }

    public String getName() {
        return name;
    }

    public String showManagersBottomUp() {
        // TODO
        String s = name + " ---> ";
        if (manager == null) return this.name;
        else {
            s += manager.showManagersBottomUp();
        }
        return s;
    }

    public String showManagersTopDown() {
        if (manager == null) return name + " has no manager";
        else if (manager.getManager() == null)
            return manager.showManagersTopDown().replace(" has no manager", "") + " is manager of " + name;
        else return manager.showManagersTopDown() + " who is manager of " + name;
    }


    public void printEmployees(int level) {
        System.out.println(("\t").repeat(level - 1) + level + ":   " + name);

        for (Employee e : managedEmployees) {
            e.printEmployees(level + 1);
        }
    }

}
