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
import javax.persistence.Entity;

/**
 *
 * @author Jeff
 */
@Entity
public class Onibus {
    @Id @Column(name = "numero", nullable = false)
    private int numero;
    @Column (name = "qtdlugar", nullable = true)
    private int qtdlugar; 
    @Column(name = "placa", nullable = true, length = 10)
    private String placa;
   
    
    public Onibus(){}
    
    public Onibus(int n, int qtd, String p){
        numero = n; 
        qtdlugar = qtd; 
        placa = p;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdlugar() {
        return qtdlugar;
    }

    public void setQtdlugar(int qtdlugar) {
        this.qtdlugar = qtdlugar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
