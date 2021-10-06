package database;

import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends AbstractDAO {

	public ProductDAO(DBaccess db) {
		super(db);
	}

	public void storeProduct(Product product) {
		String sql = "insert into Artikel(artikelcode, artikelnaam, btwtarief, artikelprijs, voorraad)"
				+ " values(?,?,?,?,?)";
		try {
			setupPreparedStatement(sql);
			preparedStatement.setString(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setString(3, product.getTaxGroup());
			preparedStatement.setDouble(4, product.getPrice());
			preparedStatement.setInt(5, product.getStockAmount());
			executeManipulateStatement();
		} catch (SQLException e) {
			System.out.println("SQL error: " + e.getMessage());
		}
	}

	public Product getProductByID(String id) {
		String sql = "Select * from Artikel where artikelcode = ?";
		Product result = null;
		try {
			setupPreparedStatement(sql);
			preparedStatement.setString(1, id);
			ResultSet rs = executeSelectStatement();
			
			while (rs.next()) {
				String productId = rs.getString("artikelcode");
				String productName = rs.getString("artikelnaam");
				String tax = rs.getString("btwtarief");
				double price = rs.getDouble("artikelprijs");
				int stock = rs.getInt("voorraad");
				result = new Product(productId, productName, tax, price, stock);
			}
		} catch (SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
		return result;
	}

	public List<Product> getProductByTaxgroup(String group) {
		String sql = "Select * from Artikel where btwtarief = ?";
		
		List<Product> result = new ArrayList<>();
		try {
			setupPreparedStatement(sql);
			preparedStatement.setString(1, group);
			ResultSet rs = executeSelectStatement();
			
			while (rs.next()) {
				String productId = rs.getString("artikelcode");
				String productName = rs.getString("artikelnaam");
				String tax = rs.getString("btwtarief");
				double price = rs.getDouble("artikelprijs");
				int stock = rs.getInt("voorraad");
				Product resultElement = new Product(productId, productName, tax, price, stock);
				result.add(resultElement);
			}
		} catch (SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
		return result;
	}

}
