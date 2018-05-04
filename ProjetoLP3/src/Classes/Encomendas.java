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
    private Date dataEntrega;

    public Encomendas(Date dataEntrega, int codigo, String nome, int quantidade, float volume, float preço) {
        super(codigo, nome, quantidade, volume, preço);
        this.dataEntrega = dataEntrega;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

   
    
    
    
    
   
    
}
