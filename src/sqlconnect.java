import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class sqlconnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
             return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
}
    
    
    
}
}
