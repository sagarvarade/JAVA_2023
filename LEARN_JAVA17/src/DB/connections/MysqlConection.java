package DB.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConection {

	public static void main(String[] args) {
		Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://sagar-PC:3306/eauthentication",
                "root", "admin");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from roles");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("id");
                title = resultSet.getString("name").trim();
                System.out.println("Code : " + code
                                   + " Title : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
	}
}
