package clases;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class conectar {
 Connection conect = null;
 private ResultSet rs;
 private PreparedStatement ps;
 private ResultSetMetaData rsm;
 DefaultTableModel dtm;
 private java.util.Date fecha = new java.util.Date(); 
 public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/terapia","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return conect;
    }
}
