/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class fungsi {
     public static void close(){
        int selectedOption = JOptionPane.showConfirmDialog(null,"Konfirmasi Tutup Sistem", "Tutup Sistem", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }
}
