/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Classes.Motorista;
import Classes.Passageiro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jeff
 */
public class MotoristaDAO {
    private Session session;

    public MotoristaDAO(Session session) {
        this.session = session;
    }

    public void salva(Motorista m) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(m);
        tx.commit();
    }

    public void remove(Motorista m) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(m);
        tx.commit();
    }

    public void atualiza(Motorista m) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(m);
        tx.commit();
    }
    
    public Motorista procura(Long id) {
        return (Motorista) 
                this.session.load(Motorista.class, id);
    }

    public List<Motorista> listaTudo() {
        return this.session.createCriteria(
                Motorista.class).list();
    }
    
    public List<Motorista> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Motorista.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Motorista> listamotoristas(int cnh){
        return session.createQuery(
                "from motorista where cnh>"+cnh).list();
    }

    public List <Motorista> listamotoristasSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Motorista.class).list();
    }
}
