package koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author D E L L
 */
public class Konfig {
    private static Connection MySQLConfig;
    public static Connection configgDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/optik"; //url database
            String user="root"; //user dbase
            String pass=""; //pass dbase
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.out.println("koneksi gagal "+e.getMessage());
        }
        return MySQLConfig;
    }
}
