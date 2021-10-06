package database;

import model.Recept;
import model.WinkelProduct;

import java.sql.SQLException;

public class WinkelProductPerReceptDAO extends AbstractDAO {
    public WinkelProductPerReceptDAO(DBaccess dBaccess) {
        super(dBaccess);
    }


    public void voegWinkelProductToeAanRecept(WinkelProduct product, Recept recept) {
        String sql = "INSERT INTO `recepten`.`winkelproductenperrecept` (`Recept_name`,`WinkelProduct_name`) VALUES (?,?);";
        try {
            setupPreparedStatementWithKey(sql);

            preparedStatement.setString(1, recept.getNaam());
            preparedStatement.setString(2, product.getNaam());

            executeInsertStatementWithKey();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
