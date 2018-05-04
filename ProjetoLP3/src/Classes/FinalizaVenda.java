/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author lb20-06
 */
public class FinalizaVenda {
        private float total, desconto;
        private String formaPagamento;

    public FinalizaVenda(float total, float desconto, String formaPagamento) {
        this.total = total;
        this.desconto = desconto;
        this.formaPagamento = formaPagamento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
        
               
}
