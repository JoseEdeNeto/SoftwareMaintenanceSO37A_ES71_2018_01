package Classes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity @Table(name="motorista")
public class Motorista {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mot_id")
    private Long id;
    
    @Column(name = "mot_cnh", nullable = false)
    private int cnh;
    
    @Column(name = "mot_nome", nullable = true, length = 50)
    private String nome;
    
    @Column(name = "mot_endereco", nullable = true, length = 100)
    private String endereco;
    
    @Column(name = "mot_telefone", nullable = true)
    private int telefone;
    
    @OneToMany(mappedBy = "motorista", targetEntity = Viagem.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Viagem> mot_viagens;
    
    public Motorista(){}

    public Motorista(int cnh, String nome, String endereco, int telefone) {
        this.cnh = cnh;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Viagem> getViagens() {
        return mot_viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.mot_viagens = viagens;
    }
      
}
