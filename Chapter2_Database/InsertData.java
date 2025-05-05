package Chapter2_Database;
import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            // PreparedStatement statement = conn.prepareStatement(sql);

            // statement.setInt(1,3);
            // statement.setString(2, "Chatur");
            // statement.setInt(3, 10);
            // int rowsInserted = statement.executeUpdate();

            String sql = "INSERT INTO students (id, name, age) VALUES (10, 'wuuhu', 20)";
            Statement statement = conn.createStatement();
            statement.execute(sql);


            // System.out.println(rowsInserted + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
