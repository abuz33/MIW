package database;

import model.Orderline;
import model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderLineDAO extends AbstractDAO {
    private ProductDAO pdao;

    public OrderLineDAO(DBaccess dBaccess) {
        super(dBaccess);
        pdao = new ProductDAO(dBaccess);
    }

    public ArrayList<Orderline> getOrderlines(int orderId) {
        String sql = "Select * from `Bestelregel` where bestelnr = ?";
        ArrayList<Orderline> orderlines = new ArrayList<>();

        try {
            setupPreparedStatement(sql);

            preparedStatement.setInt(1, orderId);

            ResultSet rs = executeSelectStatement();
            while (rs.next()) {
                Product product = pdao.getProductByID(rs.getString("artikelcode"));
                Orderline orderline = new Orderline(rs.getInt("aantal"), product);
                orderlines.add(orderline);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orderlines;
    }

    public int addOrderLine(int fkey, Orderline orderline) {
        String sql = "INSERT INTO `Bestelregel` (`bestelnr`,`artikelcode`,`aantal`) VALUES (?,?,?);";
        int key = -1;

        try {
            setupPreparedStatementWithKey(sql);

            preparedStatement.setInt(1, fkey);
            preparedStatement.setString(2, orderline.getProduct().getProductId());
            preparedStatement.setInt(3, orderline.getNumberOrdered());

            key = executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return key;
    }
}
