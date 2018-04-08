/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Jeff
 */
@Entity
public class Viagem {
    @Id @Column(name = "numero", nullable = false)
    private int numero;
    @Column(name = "descricao", nullable = true, length = 100)
    private String descricao;
    @Column (name = "preco", nullable = true)
    private float preco; 
    
    public Viagem(){}
    
    public Viagem(int n, String d, float p){
        numero = n; 
        descricao = d; 
        preco = p;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
