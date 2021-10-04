package controller;

import database.CustomerDAO;
import database.DBaccess;
import database.PersoonDAO;
import model.Customer;
import model.Persoon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersoonDBLauncher {


    public static void main(String[] args) {
        List<Persoon> personen;

/**
 * SETUP van applicatie
 */

        // maak verbinding met database engine
        DBaccess dBaccess = new DBaccess("erik", "erik", "Persoon");
        // open connection
        dBaccess.openConnection();
        // maakDAO's aan
        PersoonDAO persoonDAO = new PersoonDAO(dBaccess);
        CustomerDAO customerDAO = new CustomerDAO(dBaccess);


        //
//       personen = persoonDAO.getAllPersonen();
//       // toon de objecten
//        for (Persoon p: personen
//             ) {
//            System.out.println(p.toString());
//        }

        /**
         * Nuttige code van applicatie
         */


//        // haal alleen alle Jannen op
//        personen = persoonDAO.getPersonenByName("jan");
//        // toon de objecten
//        for (Persoon p: personen
//        ) {
//            System.out.println(p.toString());
//        }


        // maak customer aan
        Customer customer = new Customer("Heidi", "Zwitserland");
        int uniekeID = customerDAO.addCustomer(customer);
        customer.setSleutel(uniekeID);
        System.out.printf("unieke key van %s is: %d", customer.getName(), uniekeID);
        // print customer
        System.out.println(customer.toString());

        // vergelijk object met zichzelf
        System.out.println("element met zichzelf vergeleken: " + customer.equals(customer));
    }

}
