package ClassesDAO;

import Classes.Passageiro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class PassageiroDAO {
    private Session session;

    public PassageiroDAO(Session session) {
        this.session = session;
    }

    public void salva(Passageiro p) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(p);
        tx.commit();
    }

    public void remove(Passageiro p) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(p);
        tx.commit();
    }

    public void atualiza(Passageiro p) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(p);
        tx.commit();
    }
    
    public Passageiro procura(Long id) {
        return (Passageiro) 
                this.session.load(Passageiro.class, id);
    }

    public List<Passageiro> listaTudo() {
        return this.session.createCriteria(
                Passageiro.class).list();
    }
    
    public List<Passageiro> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Passageiro.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Passageiro> listapassageiros(int rg){
        return session.createQuery(
                "from passageiro where rg>"+rg).list();
    }

    public List <Passageiro> listapassageirosSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Passageiro.class).list();
    }
}
