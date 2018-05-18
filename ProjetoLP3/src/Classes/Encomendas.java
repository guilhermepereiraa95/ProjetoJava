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

    public Encomendas(Date data,  float total, float desconto,  float volume,  String formaPagamento, int codigo, int quantidade) {
        super(data,  total, desconto,  volume,  formaPagamento, codigo, quantidade);
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
