package controller;

import org.w3c.dom.ls.LSOutput;

import java.sql.*;

class Main {
    public static void main(String args[]) throws SQLException {
        ResultSet rs = null;
        int columnNumber = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bier", "root", "Asude123");
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from bier");
            columnNumber = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                StringBuilder message = new StringBuilder();
                for (int i = 1; i <= columnNumber; i++) {
                    if (rs.getObject(i) != null) {
                        System.out.println(rs.getObject(i).getClass().getSimpleName());
                    } else {
                        System.out.println(i);
                    }
                    message.append(rs.getObject(i)).append(" - ");

                }
                System.out.println(message);
            }

            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}
