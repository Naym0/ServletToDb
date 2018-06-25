
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicole Yiega
 */
public class MyDb {
    Connection conn;
    public Connection getCon()
    {
        String host= "jdbc:mysql://localhost:3306/classlab";
        String uName= "root";
        String uPass= "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(host, uName, uPass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Successful connection");
        return conn;
    }
}
