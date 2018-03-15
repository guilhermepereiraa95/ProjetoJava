/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp3;

/**
 *
 * @author Guilherme
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private String marca;    
    private int quantidade_produtos;
    private int quantidade_litros;
    private float preco;

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

    public int getQuantidade_produtos() {
        return quantidade_produtos;
    }

    public void setQuantidade_produtos(int quantidade_produtos) {
        this.quantidade_produtos = quantidade_produtos;
    }

    public int getQuantidade_litros() {
        return quantidade_litros;
    }

    public void setQuantidade_litros(int quantidade_litros) {
        this.quantidade_litros = quantidade_litros;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Produto(int codigo, String nome, String marca, int qtd_litros,int qtd_produtos, float preco){
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.quantidade_litros = qtd_litros;
        this.quantidade_produtos = qtd_produtos;
        this.preco = preco;
    }
    
    
    
}
