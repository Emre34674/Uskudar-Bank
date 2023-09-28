/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veri_tabanı;
import  gui.Hesap_Ekrani;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author emre_
 */
public class Veri_Tabanı_İşlemleri extends veri_tabanı_bağlantısı {
    
    private int kullanici_id;
    private String ad_soyadi;
    private String müşteri_no;
    private String parola;
    private int bakiye;
    private int beşTL;
    private int onTL;
    private int yirmiTL;
    private int elliTL;
    private int yüzTL;
    private int ikiyüzTL;

    public void setBeşTL(int beşTL) {
        this.beşTL = beşTL;
    }

    public void setOnTL(int onTL) {
        this.onTL = onTL;
    }

    public void setYirmiTL(int yirmiTL) {
        this.yirmiTL = yirmiTL;
    }

    public void setElliTL(int elliTL) {
        this.elliTL = elliTL;
    }

    public void setYüzTL(int yüzTL) {
        this.yüzTL = yüzTL;
    }

    public void setIkiyüzTL(int ikiyüzTL) {
        this.ikiyüzTL = ikiyüzTL;
    }

    public int getBeşTL() {
        return beşTL;
    }

    public int getOnTL() {
        return onTL;
    }

    public int getYirmiTL() {
        return yirmiTL;
    }

    public int getElliTL() {
        return elliTL;
    }

    public int getYüzTL() {
        return yüzTL;
    }

    public int getIkiyüzTL() {
        return ikiyüzTL;
    }

    
 
    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public void setAd_soyadi(String ad_soyadi) {
        this.ad_soyadi = ad_soyadi;
    }

    public void setMüşteri_no(String müşteri_no) {
        this.müşteri_no = müşteri_no;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public String getAd_soyadi() {
        return ad_soyadi;
    }

    public String getMüşteri_no() {
        return müşteri_no;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }
public boolean login(String müşteri_no, String parola) {
     
    String sorgu = "Select * from müsteritablosu where müşteri_no = ? and parola = ?"; 
        
    try {
        preparedStatement = connection.prepareStatement(sorgu); 
        preparedStatement.setString(1, müşteri_no); 
        preparedStatement.setString(2, parola); 
        

        ResultSet rs = preparedStatement.executeQuery(); 
        
        if (rs.next()) {
            
            this.kullanici_id = rs.getInt("kullanici_id");
            this.ad_soyadi = rs.getString("ad_soyadi");
            this.müşteri_no = rs.getString("müşteri_no");
            this.parola = rs.getString("parola");
            this.bakiye = rs.getInt("bakiye");
            
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Veri_Tabanı_İşlemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        return false;
    }
   
}
 public void updateBalanceInDatabase(int newBalance) {
        String updateQuery = "UPDATE müsteritablosu SET bakiye = ? where müşteri_no = ? and parola = ?"; 

    try {
        
        preparedStatement = connection.prepareStatement(updateQuery); 
        preparedStatement.setInt(1, newBalance);  
        preparedStatement.setString(2, müşteri_no); 
        preparedStatement.setString(3, parola);
        this.setBakiye(newBalance); 

        // Execute the update query
        preparedStatement.executeUpdate(); 
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
 public void updateBalanceInDatabase2(int newBalance) {
        String updateQuery = "UPDATE müsteritablosu SET bakiye = ? where müşteri_no = ? and parola = ?";

    try {
        
        preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setInt(1, newBalance);  
        preparedStatement.setString(2, müşteri_no);
        preparedStatement.setString(3, parola);
        this.setBakiye(newBalance);

       
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
 public void updatePasswordInDatabase(String newPassword,String müşteri_no) {
    String updateQuery = "UPDATE müsteritablosu SET parola = ? where müşteri_no = ? ";
   
    try {
       
        preparedStatement = connection.prepareStatement(updateQuery); 
        preparedStatement.setString(1, newPassword);   
        preparedStatement.setString(2, müşteri_no); 


       
        preparedStatement.executeUpdate(); 
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

 public void updateBalanceInDatabaseOther(int miktar,int deger)
 {
     String updateQuery = "UPDATE para_kasasi SET miktar = miktar-?  where para_degeri=?";
    
    try {
         
        preparedStatement = connection.prepareStatement(updateQuery); 
        preparedStatement.setString(1, Integer.toString(miktar));   
         preparedStatement.setString(2, Integer.toString(deger));   

        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

 
 }

public void ParaYönetimSistemi() 
 {
  
    try {
       
        String sqlSorgusu = "SELECT para_degeri, miktar FROM para_kasasi";
        preparedStatement = connection.prepareStatement(sqlSorgusu);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {                                     
            int paraDegeri = rs.getInt("para_degeri");
            int miktar = rs.getInt("miktar");

          
            switch (paraDegeri) {                     
                case 5:
                    this.setBeşTL(miktar);
                    break;
                case 10:
                    this.setOnTL(miktar);
                    break;
                case 20:
                    this.setYirmiTL(miktar);
                    break;
                case 50:
                    this.setElliTL(miktar);
                    break;
                case 100:
                    this.setYüzTL(miktar);
                    break;
                case 200:
                    this.setIkiyüzTL(miktar);
                    break;
                default:
                  
                    System.out.println("Bilinmeyen Para Degeri!");
                    break;
            }
        }
    } catch (SQLException e) {
       
        e.printStackTrace();
    } 
}
 public void updatePara_Kasasi_Yatir(int miktar,int para_degeri)
 {
    
String updateQuery = "UPDATE para_kasasi SET miktar = miktar + ? WHERE para_degeri = ?";
       
    try {
         
        preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, Integer.toString(miktar));
         preparedStatement.setString(2, Integer.toString(para_degeri));

        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

 
 }




}

   

  

   





     

