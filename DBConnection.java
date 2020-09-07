/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author THE UNIVERSE BOSS
 */
public class DBConnection {
    private static Connection conn;
    static{
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-AVDIH5M:1521/xe","onlineexam","student");
            JOptionPane.showMessageDialog(null, "Connected Successfully To The Database","Success!",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error Connecting To The Database:"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        if(conn!=null){
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null, "DisConnected Successfully From The Database","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Error Disconnecting From The Database:"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
        }
    }
}
}



