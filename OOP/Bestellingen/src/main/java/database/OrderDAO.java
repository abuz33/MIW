package database;

import model.Customer;
import model.Order;
import model.Orderline;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAO extends AbstractDAO {
    private OrderLineDAO odao;
    private CustomerDAO cdao;

    public OrderDAO(DBaccess dBaccess) {
        super(dBaccess);
        odao = new OrderLineDAO(dBaccess);
        cdao = new CustomerDAO(dBaccess);
    }

    private int storeOrder(Order order) {
        String sql = "INSERT INTO `Bestelling`(`klantnr`,`besteldatum`) VALUES (?,?);";
        int key = -1;

        try {
            this.setupPreparedStatementWithKey(sql);

            preparedStatement.setInt(1, order.getCustomer().getCustomerId());
            preparedStatement.setDate(2, Date.valueOf(order.getDatum()));

            key = executeInsertStatementWithKey();
            for (Orderline orderline : order.getOrderlines()) {
                int orderKey = odao.addOrderLine(key, orderline);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return key;
    }

    public Order getOrderByOrderId(int id) {
        Order order = null;
        String sql = "Select * from bestelling where bestelnr = ?";

        try {
            setupPreparedStatementWithKey(sql);

            preparedStatement.setInt(1, id);
            ResultSet rs = executeSelectStatement();

            if (rs.next()) {
                Customer customer = cdao.getCustomerById(rs.getInt("klantnr"));
                ArrayList<Orderline> orderlines = odao.
                order = new Order(customer, orderLines)
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return order;
    }
}
