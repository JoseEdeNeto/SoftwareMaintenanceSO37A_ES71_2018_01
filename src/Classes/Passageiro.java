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
    private Long id;
    
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

    @Override
    public String toString() {
        return id + "; cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    
    public Long getId(){
        return id;
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) throws Exception {
        if(cpf == 0)
            throw new Exception ("CPF não foi informado!");
        else  
            this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) throws Exception {
       if(telefone == 0)
            throw new Exception ("Telefone não foi informado!");
        else  
            this.telefone = telefone;
    }
     
    public int getCPF() {
        return getCpf();
    }

    public void setRg(int rg)throws Exception {
        if(rg == 0)
            throw new Exception ("RG não foi informado!");
        else  
            this.setRg(rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome)throws Exception {
        if(nome == null)
            throw new Exception ("Nome não foi informado!");
        else  
            this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if(endereco == null)
            throw new Exception ("Endereco não foi informado!");
        else  
            this.endereco = endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
