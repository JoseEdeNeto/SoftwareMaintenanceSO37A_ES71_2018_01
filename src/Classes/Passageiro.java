package Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity @Table(name="passageiro")
public class Passageiro implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pas_id")
    private int id;
    
    @Column(name = "pas_cpf", nullable = false)
    private int cpf;
    
    @Column(name = "pas_nome", nullable = true, length = 50)
    private String nome;
    
    @Column(name = "pas_endereco", nullable = true, length = 100)
    private String endereco;
    
    @Column(name = "pas_telefone", nullable = true)
    private int telefone;
    
    
    public Passageiro(){}

    public Passageiro(int cpf, String nome, String endereco, int telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public int getId(){
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
     
    public int getCPF() {
        return getCpf();
    }

    public void setRg(int cpf) {
        this.setCpf(cpf);
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

    public void setId(int id) {
        this.id = id;
    }
    
}
