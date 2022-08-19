package jdbc;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_class", "root", "password");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from class");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}