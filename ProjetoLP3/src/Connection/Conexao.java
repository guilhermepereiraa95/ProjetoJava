/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Guilherme
 */
public class Conexao {
    
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL ="jdbc:mysql://localhost:3306/projetolp3";
    private final String USER="root";
    private final String PASSWORD = "";
    
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException |SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados\n",ex);
        }
    }
    
    public static void closeConnection(Connection con){
    if(con!=null){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
}
