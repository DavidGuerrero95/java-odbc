package com.diplomado.java.jdbc.util;

import java.sql.*;

public class ConexionBD {

    private static String url = "jdbc:mysql://localhost:3306/java_curso";
    private static String user = "root";
    private static String password = "";
    private static Connection conn;

    public static Connection getInstance() throws SQLException{
        if (conn == null) conn = DriverManager.getConnection(url, user, password);
        return conn;
    }



}
