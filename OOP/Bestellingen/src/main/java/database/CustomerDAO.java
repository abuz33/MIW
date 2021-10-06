package database;

import model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO extends AbstractDAO {
    public CustomerDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public Customer getCustomerById(int customerId) {
        String sql = "Select * from FROM Klant where klantnr = ?;";
        Customer customer = null;
        try {
            this.setupPreparedStatementWithKey(sql);

            this.preparedStatement.setInt(1, customerId);

            ResultSet rs = this.executeSelectStatement();
            if (rs.next()) {
                customer = new Customer(customerId, rs.getString("klantnaam"), rs.getString("plaats"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    public ArrayList<Customer> getCustomerByCity(String city) {
        String sql = "Select * from Klant where plaats = ?;";
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            setupPreparedStatementWithKey(sql);

            preparedStatement.setString(1, city);

            ResultSet rs = executeSelectStatement();

            while (rs.next()) {
                Customer customer = new Customer(rs.getInt("klantnr"), rs.getString("klantnaam"), rs.getString("plaats"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }

    public int storeCustomer(Customer customer) {
        String sql = "INSERT INTO `Bestellingen`.`Klant`(`klantnaam`,`plaats`) VALUES(?,?);";
        int key = -1;
        try {
            this.setupPreparedStatementWithKey(sql);

            this.preparedStatement.setString(1, customer.getCustomerName());
            this.preparedStatement.setString(1, customer.getCity());

            key = this.executeInsertStatementWithKey();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return key;
    }

}
