package Classes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity @Table(name="viagem")
public class Viagem {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "via_id")
    private Long id;
    
    @Column(name = "via_data_saida", nullable = false, length = 11)
    private String dataSaida;
    
    @Column(name = "via_data_chegada", nullable = false, length = 11)
    private String dataChegada;
    
    @Column(name = "via_hora_saida", nullable = false, length = 6)
    private String horaSaida;
    
    @Column(name = "via_hora_chegada", nullable = false, length = 6)
    private String horaChegada;
    
    @Column(name = "via_preco", nullable = false)
    private float preco;
    
    @Column(name = "via_cidade_saida", nullable = false, length = 50)
    private String cidadeSaida;
    
    @Column(name = "via_cidade_chegada", nullable = false, length = 50)
    private String cidadeChegada;
    
    @ManyToOne
    @JoinColumn(name = "mot_viagens")
    private Motorista motorista;
    
    @ManyToOne
    @JoinColumn(name = "oni_viagens")
    private Onibus onibus;
    
    @Column(name = "via_passageiros")
    @ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name = "viagens_passageiros", joinColumns=@JoinColumn(name="via_id"), inverseJoinColumns=@JoinColumn(name="pas_id"))  
    private List<Passageiro> passageiros;
    
    public Viagem(){}

    public Viagem(String dataSaida, String dataChegada, String horaSaida, String horaChegada, float preco, 
                String cidadeSaida, String cidadeChegada, Motorista motorista, Onibus onibus, List<Passageiro> passageiros) {
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.horaSaida = horaSaida;
        this.horaChegada = horaChegada;
        this.preco = preco;
        this.cidadeSaida = cidadeSaida;
        this.cidadeChegada = cidadeChegada;
        this.motorista = motorista;
        this.onibus = onibus;
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return id + ";" + "dataSaida=" + dataSaida + ", dataChegada=" + dataChegada + ", horaSaida=" 
                + horaSaida + ", horaChegada=" + horaChegada + ", preco=" + preco + ", cidadeSaida=" 
                + cidadeSaida + ", cidadeChegada=" + cidadeChegada + ", Quantidade de lugares=" + onibus.getQtdlugar();
    }
    
    
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco)throws Exception {
        if(preco == 0)
            throw new Exception ("Preco não foi informado!");
        else
            this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida)throws Exception {
        if(dataSaida == null)
            throw new Exception ("Data de saida não foi informado!");
        else
            this.dataSaida = dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada)throws Exception {
        if(dataChegada == null)
            throw new Exception ("Data chegada não foi informado!");
        else
            this.dataChegada = dataChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida)throws Exception {
        if(horaSaida == null)
            throw new Exception ("Hora saida não foi informado!");
        else
            this.horaSaida = horaSaida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada)throws Exception {
        if(horaChegada == null)
            throw new Exception ("Hora de chegada não foi informado!");
        else
            this.horaChegada = horaChegada;
    }

    public String getCidadeSaida() {
        return cidadeSaida;
    }

    public void setCidadeSaida(String cidadeSaida)throws Exception {
        if(cidadeSaida == null)
            throw new Exception ("Cidade de saida não foi informado!");
        else
            this.cidadeSaida = cidadeSaida;
    }

    public String getCidadeChegada() {
        return cidadeChegada;
    }

    public void setCidadeChegada(String cidadeChegada)throws Exception {
        if(cidadeChegada== null)
            throw new Exception ("Cidade de chegada não foi informado!");
        else
            this.cidadeChegada = cidadeChegada;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista)throws Exception {
        if(motorista == null)
            throw new Exception ("Motorista não foi informado!");
        else
            this.motorista = motorista;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) throws Exception{
        if(onibus == null)
            throw new Exception ("Onibus não foi informado!");
        else
            this.onibus = onibus;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros)throws Exception {
        if(passageiros == null)
            throw new Exception ("Passageiro não foi informado!");
        else
            this.passageiros = passageiros;
    }
    
}
