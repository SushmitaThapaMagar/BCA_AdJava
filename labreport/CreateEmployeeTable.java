import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {
    public static void main(String[] args) {
        // Database connection details
        String jdbcUrl = "jdbc:postgresql://localhost:5432/mydatabase"; // Change as needed
        String username = "myuser";
        String password = "mypassword";

        // SQL statement to create the employee table
        String createTableSQL = "CREATE TABLE employee ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(50) NOT NULL, "
                + "age INT, "
                + "salary DECIMAL(10,2)"
                + ")";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employee' created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
