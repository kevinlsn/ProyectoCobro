/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dilemma.cerveza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kevinlsn
 */
public class DB {
    
    public static Connection mycon(){
        
        Connection con = null;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cerveceria","dilemma","VF@5dY9mvxG407oG");
            return con;
            
        } catch (ClassNotFoundException | SQLException e){
            
            System.out.println(e);
            return null;
        }
    }
    
    
}
