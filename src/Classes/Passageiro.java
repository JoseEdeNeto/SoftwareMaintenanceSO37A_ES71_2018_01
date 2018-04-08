package Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
@Entity
public class Passageiro {
    @Id @Column(name = "rg", nullable = false)
    private int rg;
    @Column(name = "nome", nullable = true, length = 50)
    private String nome;
    @Column(name = "endereco", nullable = true, length = 100)
    private String endereco;
    @Column (name = "telefone", nullable = true)
    private int telefone; 
    
    public Passageiro(){}
    
    public Passageiro(int r, String nm, String end, int t){
        nome = nm;
        endereco = end;
        rg = r; 
        telefone = t; 
    }
   
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
     

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
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
}
