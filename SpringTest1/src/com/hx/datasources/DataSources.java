package com.hx.datasources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataSources {

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public Connection get() throws Exception {
		Class.forName(properties.getProperty("jdbc.driverClass"));
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
}
