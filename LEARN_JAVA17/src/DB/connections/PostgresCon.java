package DB.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresCon {

	public static void main(String[] args) {

		System.out.println("tsttt  sds");

		main2();
	}

	public static void main2() {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Development",
				"postgres", "admin")) {
			System.out.println("Java JDBC PostgreSQL Example");
			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			System.out.println("Reading car records...");
			ResultSet resultSet = statement.executeQuery("SELECT  * FROM public.test");
			while (resultSet.next()) {
				System.out.printf("%-30.30s", resultSet.getString(1));
			}
		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}

	}

}