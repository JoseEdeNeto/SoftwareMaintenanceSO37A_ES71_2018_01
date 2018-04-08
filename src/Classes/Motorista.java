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
public class Motorista {
    @Id @Column(name = "cnh", nullable = false)
    private int cnh;
    @Column(name = "nome", nullable = true, length = 50)
    private String nome;
    @Column(name = "endereco", nullable = true, length = 100)
    private String endereco;
    @Column (name = "telefone", nullable = true)
    private int telefone;
    
    public Motorista(){}
    
    public Motorista(int c, String n, String e, int tel){
        cnh = c; 
        nome = n;
        endereco = e;
        telefone = tel; 
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
