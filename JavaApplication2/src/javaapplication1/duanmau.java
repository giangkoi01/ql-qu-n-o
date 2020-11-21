/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class duanmau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String use="sa";
        String pass="123";
        String url="jdbc:sqlserver://localhost:1433;databaseName=qllaptop4";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cn=DriverManager.getConnection(url,use,pass);
            if(cn!=null){
                System.out.println(" kết nối thành công");
            }
        } catch (Exception e) {
            System.out.println("lỗi"+e);
        }
    }
    
}
