/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan901;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Asus
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            dbkoneksi dbk = new dbkoneksi();
            Statement stm = dbk.koneksi().createStatement();
            String sql = "SELECT * FROM datateman;";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next() ){
                System.out.println("Nama : " + rs.getString("namateman"));
            }
        }catch(Exception err){
            System.out.println("Terjadi masalah koneksi di database!");  
        }
    }
    
}
