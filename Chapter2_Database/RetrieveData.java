package Chapter2_Database;
import java.sql.*;

public class RetrieveData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM students";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println("ID: " + result.getInt("id") + ", Name: " + result.getString("name") + ", Age: "
                        + result.getInt("age"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}