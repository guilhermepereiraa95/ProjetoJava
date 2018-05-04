/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author guifv
 */
public class CadastraVenda extends Produto {
        
    private Date data;
    private float subtotal;
    
    public CadastraVenda(int codigo, String nome, int quantidade, float volume, float preço) {
        super(codigo, nome, quantidade, volume, preço);
        
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getSubTotal() {
        return subtotal;
    }

    public void setSubTotal(float subtotal) {
        this.subtotal = subtotal;
    }
        

    
        
        
         
}
