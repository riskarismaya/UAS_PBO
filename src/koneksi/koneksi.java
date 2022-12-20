/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    public static Connection con;
    
    public static Connection getKoneksi(){
        if(con == null){
            try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_perpus", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal!");
        } 
        }
        return con; 
  }
}
