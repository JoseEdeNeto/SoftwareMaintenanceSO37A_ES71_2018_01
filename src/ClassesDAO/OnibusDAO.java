package ClassesDAO;

import Classes.Onibus;
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
public class OnibusDAO {
    private Session session;

    public OnibusDAO(Session session) {
        this.session = session;
    }

    public void salva(Onibus o) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(o);
        tx.commit();
    }

    public void remove(Onibus o) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(o);
        tx.commit();
    }

    public void atualiza(Onibus o) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(o);
        tx.commit();
    }
    
    public Onibus procura(Long id) {
        return (Onibus) 
                this.session.load(Onibus.class, id);
    }

    public List<Onibus> listaTudo() {
        return this.session.createCriteria(
                Onibus.class).list();
    }
    
    public List<Onibus> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Onibus.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Onibus> listaonibus(int numero){
        return session.createQuery(
                "from onibus where oni_numero>"+numero).list();
    }

    public List <Onibus> listaonibusSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Onibus.class).list();
    }
}
