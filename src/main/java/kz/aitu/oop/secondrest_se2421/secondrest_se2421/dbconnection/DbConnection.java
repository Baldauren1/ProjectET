package kz.aitu.oop.secondrest_se2421.secondrest_se2421.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection connect() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/zoo_db";
        String user = "postgres";
        String password = "0528bal";
        return DriverManager.getConnection(url, user, password);
    }
}