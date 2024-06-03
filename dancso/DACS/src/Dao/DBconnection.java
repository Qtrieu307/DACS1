/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {


	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/dacs", "root", "Phamnhuquocbin37@");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }

	   
	    
	}
   


