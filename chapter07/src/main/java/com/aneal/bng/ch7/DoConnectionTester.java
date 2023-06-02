package com.aneal.bng.ch7;
/**
 * This implementation, although functional, is a little redundant and the logic
 * is not following programming best practices. More suitable would be a do-while
 * implementation, one that avoids testing if the con instance is null, considering that it
 * clearly is, as in the following.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoConnectionTester {
    public static final int MAX_TRIES = 10;

    public static void main(String[] args) throws Exception{
        int cntTries = 0;
        Connection con = null;
        do {
            try{
                Class.forName("com.mysql.cj.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sample", "root", "pass"
                );
            } catch (Exception e){
                ++cntTries;
                System.out.println("Connection refused. Retrying in 5 secons ...");
                Thread.sleep(5000);
            }
        } while (con == null && cntTries < MAX_TRIES);
        if (con != null){
            // con != null, do something
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test");
            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            con.close();
        } else {
            System.out.println("Could not connect!");
        }
    }
}
