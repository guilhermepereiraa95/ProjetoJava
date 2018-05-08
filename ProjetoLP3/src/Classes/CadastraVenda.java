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
public class CadastraVenda {
        
    private Date data;
    private float subtotal, total, desconto, preço, volume;
    private String nome, formaPagamento;
    private int codigo, quantidade;

    public CadastraVenda(Date data, float subtotal, float total, float desconto, float preço, float volume, String nome, String formaPagamento, int codigo, int quantidade) {
        this.data = data;
        this.subtotal = subtotal;
        this.total = total;
        this.desconto = desconto;
        this.preço = preço;
        this.volume = volume;
        this.nome = nome;
        this.formaPagamento = formaPagamento;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public CadastraVenda(){
        
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
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

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   
}