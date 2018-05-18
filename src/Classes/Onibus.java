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


@Entity @Table(name="onibus")
public class Onibus {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "oni_id")
    private Long id;
    
    @Column(name = "oni_numero", nullable = false)
    private int numero;
    
    @Column(name = "oni_qtdlugar", nullable = true)
    private int qtdlugar; 
    
    @Column(name = "oni_placa", nullable = true, length = 10)
    private String placa;
    
    @OneToMany(mappedBy = "onibus", targetEntity = Viagem.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Viagem> oni_viagens;
   
    public Onibus(){}

    public Onibus(int numero, int qtdlugar, String placa) {
        this.numero = numero;
        this.qtdlugar = qtdlugar;
        this.placa = placa;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Viagem> getViagens() {
        return oni_viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.oni_viagens = viagens;
    }

}
