/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *public static Connection getConnection(String url):Method of driverManagerclass-> established connection with URL
 * @author Asus
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","admin");
            return con;
        }
        catch(Exception e){
        return null;
        }
    }
    
}
