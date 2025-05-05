package Chapter2_Database;
import java.sql.*;

public class DeleteDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // String sql = "DELETE FROM students WHERE id = ?";
            // PreparedStatement statement = conn.prepareStatement(sql);
            // statement.setInt(1, 3); // Change '1' to the id you want to delete

            // int rowsDeleted = statement.executeUpdate();
            // if (rowsDeleted > 0) {
            //     System.out.println("A student was deleted successfully!");
            // } else {
            //     System.out.println("No student found with the given id.");
            // }


        String sql1 = "DELETE from students WHERE id = 10";
            Statement stmt = conn.createStatement();
            stmt.execute(sql1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

