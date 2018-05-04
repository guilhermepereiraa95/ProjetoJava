/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author ivanf
 */
public class Encomendas extends Produto {
    
    //Atributos
    private Date data;
    
    
    
    public Encomendas(int codigo, String nome, int quantidade, double volume, float preço) {
        super(codigo, nome, quantidade, volume, preço);
    }
    
}
