/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Produto;
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ProdutoDAO {
    
    public void create(Produto produto){
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("insert into produto (codigo, nome, quantidade, volume, preco) values(?,?,?,?,?)");
            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2,produto.getNome());
            stmt.setInt( 3, produto.getQuantidade());
            stmt.setFloat(4, produto.getVolume());
            stmt.setFloat(5, produto.getPreço());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problema na conexão com o BD! " + ex);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Problema na conexão com o BD! " + ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    public void update(Produto p){
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE produto SET nome = ?, quantidade=?, volume=?, preco=? WHERE codigo=?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setFloat(3, p.getVolume());
            stmt.setFloat(4, p.getPreço());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problema na conexão com o BD! " + ex);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Problema na conexão com o BD! " + ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
     /*
     * @return
     */
    public List<Produto> read(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Produto produto = new Produto();
                
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setVolume(rs.getFloat("volume"));
                produto.setPreço(rs.getFloat("preco"));
                
                produtos.add(produto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o BD" + ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    
    }
    
    
    public void delete(){
    
    }
}
