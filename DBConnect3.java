/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

/**
 *
 * @author Naren
 */
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



class DBConnect3{  
public static void main(String args[])throws SQLException{  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3323/naren","root","root");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        
        String s = "INSERT INTO NAREN VALUES(103,'SMITH')";
        
        stmt.execute(s);
         
        con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
}  