
package br.com.ferias.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://192.168.1.7:3306/BDPROJETOPDM",
                    "usuario", "123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        
        }
        
    }
}
