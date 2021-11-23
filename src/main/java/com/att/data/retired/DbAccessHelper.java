package com.att.data.retired;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbAccessHelper {
	
    private final String url = "jdbc:postgresql://localhost:5432/dev1";
    private final String user = "rb9594";
    private final String password = "Nationals2025!";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
