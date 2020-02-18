package all.dbHelper;

import all.utils.PropertyReader;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    public static Connection getConnection() {
        try {
            Driver driver = (Driver) Class.forName(PropertyReader.getProperty("driver")).newInstance();
            DriverManager.registerDriver(driver);
            return DriverManager.getConnection(PropertyReader.getProperty("base"));
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

}
