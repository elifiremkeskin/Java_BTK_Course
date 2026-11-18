import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbHelper {
    String url = "jdbc:postgresql://localhost:5432/world";
    String user = "postgres";
    String password = "12345";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void showErrorMessage (SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
