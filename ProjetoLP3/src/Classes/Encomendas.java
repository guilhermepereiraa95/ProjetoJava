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
public class Encomendas extends CadastraVenda {
    
    //Atributos
    private Date data;

    public Encomendas(Date data, int codigo, String nome, int quantidade, double volume, float preço) {
        super(codigo, nome, quantidade, volume, preço);
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
   
    
}
