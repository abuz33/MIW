package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBaccess {

    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver"; // naam van de driver
    private static final String PREFIX_CONNECTION_URL = "jdbc:mysql://localhost:3306/"; // connectie via netwerk
    private String MAIN_USER;
    private String MAIN_USER_PASSWORD = "erik";
    private String DATABASE_NAME = "Persoon";  // schema naam
    private static final String CONNECTION_SETTINGS = "?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static final String SQL_EXCEPTION = "SQL Exception: ";

    private Connection connection;

    public DBaccess(String MAIN_USER, String MAIN_USER_PASSWORD, String DATABASE_NAME) {
        this.MAIN_USER = MAIN_USER;
        this.MAIN_USER_PASSWORD = MAIN_USER_PASSWORD;
        this.DATABASE_NAME = DATABASE_NAME;
        this.connection = null;
    }

    /**
     * Open database connection
     */
    public void openConnection() {
        String connectionURL = PREFIX_CONNECTION_URL + DATABASE_NAME + CONNECTION_SETTINGS;
        try {
            System.out.print("Load driver... ");
            Class.forName(MYSQL_DRIVER);				// Explicitly load the JDBC-driver.
            System.out.println("Driver geladen");

            System.out.println("Open connectie " + connectionURL + "... ");
            connection = DriverManager.getConnection(connectionURL, MAIN_USER, MAIN_USER_PASSWORD);
            System.out.println("OK, Connectie open");
        } catch (ClassNotFoundException driverProblem) {
            System.out.println("Driver not found: " + driverProblem.getMessage());
        } catch (SQLException sqlproblem) {
            System.out.println(SQL_EXCEPTION + sqlproblem.getMessage());
        }
    }

    /**
     * Close database connection
     */
    public void closeConnection() {
        try
        {
            if(this.connection != null){
                connection.close();
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }


}
