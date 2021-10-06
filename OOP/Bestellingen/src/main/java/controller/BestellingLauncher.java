package controller;

import database.CustomerDAO;
import database.DBaccess;
import database.ProductDAO;
import model.Customer;
import model.Product;

import java.util.ArrayList;

public class BestellingLauncher {

    private static final String DASHED_LINE = "------------------------";

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("bestellingen", "userBestellingen", "pwBestellingen");
        dBaccess.openConnection();
        System.out.println("Connection open");
        System.out.println(DASHED_LINE);
//        ProductDAO productDAO = new ProductDAO(dBaccess);
//
//        // ***************************************************************
//        // Start project
//        // ***************************************************************
//        // Sla een product op in de tabel Artikel
//        System.out.println(DASHED_LINE);
//		Product tv = new Product("A9","Sony A6300", "hoog", 1099.99, 6);
//		productDAO.storeProduct(tv);
//
//		// Lees een product uit de tabel Artikel
//        String id = "A5";
//        Product product = productDAO.getProductByID(id);
//        if (product == null) {
//            System.out.println("Product with productId " + id + " does not exist");
//        }
//        else {
//            System.out.println(product);
//        }

        CustomerDAO customerDAO = new CustomerDAO(dBaccess);
        ArrayList<Customer> cs = customerDAO.getCustomerByCity("Durgerdam");
        for (Customer c : cs) {
            System.out.println(c);
        }
        dBaccess.closeConnection();
    }
}
