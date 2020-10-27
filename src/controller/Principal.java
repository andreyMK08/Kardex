
package controller;

import connection.ConnectionFactory;
import java.sql.Connection;

public class Principal {
    
    public static void main(String[] args){
        Connection con = ConnectionFactory.getConnection();
        System.out.println("Conectado!");
        ConnectionFactory.closeConnection(con);
        System.out.println("Desconectado!");
    }
    
}
