/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workninja;

/**
 *
 * @author HP
 */


import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;



 
public class school {
 
     public static void main(String[] args) {
         try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
         System.out.println(con);
         
         Statement stmt = con.createStatement();
          ResultSet id = stmt.executeQuery("select firstName from info");
          
         while(id.next()) {
               
                System.out.println(id.getString(1));
            }

          con.close();

         }
         catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(school.class.getName()).log(Level.SEVERE,null,ex);
             
         }
         
             
         }
        
     }

   

        
     

