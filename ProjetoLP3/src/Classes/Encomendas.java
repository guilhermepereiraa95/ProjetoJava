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

    public Encomendas(Date data, float subtotal, float total, float desconto, float preço, float volume, String nome, String formaPagamento, int codigo, int quantidade) {
        super(data, subtotal, total, desconto, preço, volume, nome, formaPagamento, codigo, quantidade);
    }

    public Encomendas() {
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
   
    
    
}
