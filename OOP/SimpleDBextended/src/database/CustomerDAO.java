package database;

import model.Customer;

import java.sql.SQLException;

public class CustomerDAO extends AbstractDAO{

    public CustomerDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    /**
     * add customer, and return unique key of Customer
     * @param customer
     * @return
     */
    public int addCustomer(Customer customer){
        String sql = "insert into customer (name, country) values (?,?)";
        int key = -1; // default value
        try {
            this.setupPreparedStatementWithKey(sql);
            //
            this.preparedStatement.setString(1,customer.getName());
            this.preparedStatement.setString(2,customer.getCountry());
            //
            key = this.executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return key;
    }
}
