/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Guilherme
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private String marca;
    private int qtd_garrafas;
    private float qtd_litros;
    private float custo_unitario;
    private float custo_total;
    private float litragem_lote;
    
    public Produto(int cod, String nome, String marca, int qtd_g, float qtd_l, float custo_uni,float custo_t, float litragem_total){
     this.codigo = cod;
     this.nome = nome;
     this.marca = marca;
     this.qtd_garrafas = qtd_g;
     this.qtd_litros = qtd_l;
     this.custo_unitario = custo_uni;
     this.custo_total=custo_t;     
     this.litragem_lote = litragem_total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtd_garrafas() {
        return qtd_garrafas;
    }

    public void setQtd_garrafas(int qtd_garrafas) {
        this.qtd_garrafas = qtd_garrafas;
    }

    public float getQtd_litros() {
        return qtd_litros;
    }

    public void setQtd_litros(float qtd_litros) {
        this.qtd_litros = qtd_litros;
    }

    public float getCusto_unitario() {
        return custo_unitario;
    }

    public void setCusto_unitario(float custo_unitario) {
        this.custo_unitario = custo_unitario;
    }

    public float getCusto_total() {
        return custo_total;
    }

    public void setCusto_total(float custo_total) {
        this.custo_total = custo_total;
    }
    
    public float getLitragem_lote() {
        return litragem_lote;
    }

    public void setLitragem_lote(float litragem_lote) {
        this.litragem_lote = litragem_lote;
    }
    
}
