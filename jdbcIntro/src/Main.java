//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        DbHelper helper = new DbHelper();

        try {
            conn = helper.getConnection();
            System.out.println("Bağlantı başarılı!");
        } catch (SQLException e) {
            helper.showErrorMessage();
            System.out.println("Bağlantı hatası: " + e.getMessage());
        } finally {
            conn.close();
        }
    }
}