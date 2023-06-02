package com.aneal.bng.ch7;
/**
 * The problem with this code is that it runs forever; if we want to give up trying after a
 * certain time, we must introduce a variable that counts the number of tries and then exits
 * the loop using a break statement.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTester {
    public static void main(String[] args) throws Exception {

        Connection con = null;
        while (con == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:msql://localhost:3306/sample", "root", "pass"
                );
            } catch (Exception e){
                System.out.println("Connection refused. Retrying in 5 seconds ...");
                Thread.sleep(5000);
            }
        }
        // con != null, do something
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test");
        while (rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        con.close();
    }
}
