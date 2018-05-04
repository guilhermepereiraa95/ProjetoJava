/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Produto;
import Connection.Conexao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ProdutoDAO {
    
//    public void create(Produto produto){
//            Connection con = Conexao.getConnection();
//            PreparedStatement stmt = null;
//        
//        try {
//            
//           // stmt = con.prepareStatement("insert into produto (codigo, produto, quantidade, volume, preco) values(?,?,?,?,?)");
//            /*stmt.setInt(1, produto.getCodigo());
//            stmt.setString(2,produto.getNome());
//            stmt.setInt( 3, produto.getQuantidade());
//            stmt.setFloat(4, produto.getVolume());
//            stmt.setFloat(5, produto.getPreço());*/
//            resultSet rs = stmt.execute("insert into produto (codigo, produto, quantidade, volume, preco) values(7,'a',1,1,1)");
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "Problema na conexão com o BD! " + ex);
//        }
//    }
    /**
     *
     * @return
     */
    public List read(){
        
        
        return null;
    
    }
    
    public void update(){
    
    }
    
    public void delete(){
    
    }
}
