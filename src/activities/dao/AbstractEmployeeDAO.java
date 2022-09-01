package activities.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbstractEmployeeDAO {
    private final String URL =  "jdbc:mysql://localhost:3306/classicmodels";
    private final String USER = "root";
    private final String PASS = "password";
    protected Connection conn=null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    // method to connect to the database
    public void connect(){
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void closeConnection() {
        try {
            if (!rs.equals(null)) {
                if (!rs.isClosed()) rs.close();
            }

            if (!ps.equals(null)) {
                if(!ps.isClosed()) ps.close();
            }

            if (!conn.equals(null)) {
                if(!conn.isClosed()) conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}