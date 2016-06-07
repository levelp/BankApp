package jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * Подключение к БД Postgres по JDBC
 */
public class JDBCDemo {

    @Test
    public void testConnection() throws SQLException {
        // Создаём соединение с БД
        String jdbc = "jdbc:postgresql://localhost:5432/bankapp";
        try (Connection con = DriverManager.getConnection(jdbc,
                "postgres", "123")) {
            Statement s = con.createStatement();
            ResultSet resultSet = s.executeQuery("SELECT * FROM \"user\" ORDER BY id");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + " " +
                                resultSet.getString("name")
                );
            }
            int rows = s.executeUpdate("UPDATE \"user\" SET name = 'Илья' WHERE id = 1001");
            System.out.println("rows = " + rows);
        }
    }
}
