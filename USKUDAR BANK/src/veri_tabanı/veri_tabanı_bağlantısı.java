/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veri_tabanı;

import gui.Loglama_Sistem;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author emre_
 */
public class veri_tabanı_bağlantısı {
  
    private final String host="localhost"; 
    private final String port="3306"; 
    private final String databasename="Uskudar_Bank";
    private final String user="root";
    private final String password="";
    
    Connection connection=null;  
    private Statement statament=null;   
    PreparedStatement preparedStatement = null; 
 
   
   
 

    public veri_tabanı_bağlantısı() {
     String url = "jdbc:mysql://" + host + ":" + port + "/" + databasename+ "";  
     try {
            this.connection = DriverManager.getConnection(url, this.user, this.password);
          Loglama_Sistem.log(">>> Baglanti Basarili. Sistem sorunsuz calisiyor...");

        } catch (SQLException ex) {
            Logger.getLogger(veri_tabanı_bağlantısı.class.getName()).log(Level.SEVERE, null, ex);
                  Loglama_Sistem.log(">>> Baglanti Basarisiz...");
            
        }
    }

   
    
}
