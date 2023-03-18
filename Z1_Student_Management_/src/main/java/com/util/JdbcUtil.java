package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	private JdbcUtil() {
	}

	public static Connection getJdbcConnection() throws SQLException, IOException {

		/*
		 * String fileLoc =
		 * "D:\\octbatchservletpgms\\JDBCCRUDAPP\\src\\main\\java\\in\\ineuron\\properties\\application.properties";
		 * HikariConfig config = new HikariConfig(fileLoc); HikariDataSource dataSource
		 * = new HikariDataSource(config);
		 */

		return physicalConnection();
	}

	private static Connection physicalConnection() throws FileNotFoundException, IOException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String fileLoc = "C:\\Users\\rishi\\eclipse-workspace\\Z1_Student_Management_\\src\\main\\java\\com\\properties\\application.properties";
			FileInputStream fis = new FileInputStream(fileLoc);
			Properties properties = new Properties();
			properties.load(fis);

			String url = properties.getProperty("jdbcUrl");
			String username = properties.getProperty("user");
			String password = properties.getProperty("password");

			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
