package Chapter2_Database;
import java.sql.*;

public class UpdateDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
            // PreparedStatement statement = conn.prepareStatement(sql);
            // statement.setString(1, "sushh"); // Change to the new name
            // statement.setInt(2, 22);            // Change to the new age
            // statement.setInt(3, 1);             // Change '1' to the id you want to update

            // int rowsUpdated = statement.executeUpdate();
            // if (rowsUpdated > 0) {
            //     System.out.println("A student was updated successfully!");
            // } else {
            //     System.out.println("No student found with the given id.");
            // }

            String sql1 = "UPDATE students SET name = 'WOW' WHERE id = 3";
            Statement stmt = conn.createStatement();
            stmt.execute(sql1);




            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
