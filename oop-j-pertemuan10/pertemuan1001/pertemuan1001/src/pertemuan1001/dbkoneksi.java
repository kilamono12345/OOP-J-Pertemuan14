
package pertemuan1001;
import java.sql.DriverManager;
import java.sql.Connection; 
import java.sql.SQLException;
/**
 *
 * @author sakila
 * TGL 20 Mei 2025
 */
public class dbkoneksi {
    static String JDBC_DRIVER="com.mysql.cj.jbdc.Drive";
     static String DB_USER="root";
     static String DB_PASSWORD="";
     static String DB_URL="jbdc:mysql://localhost:3306/mahasiswa";
     
     public Connection koneksi (){
         try{
             Class.forName(JDBC_DRIVER);
             return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         }catch(ClassNotFoundException | SQLException eer){
             System.out.println ("Gagal Koneksi Ke Database");
         }
         return null;
     }
    
}
