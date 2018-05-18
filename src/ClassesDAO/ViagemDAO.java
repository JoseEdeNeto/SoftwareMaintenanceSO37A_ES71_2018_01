/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Classes.Viagem;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jeff
 */
public class ViagemDAO {
    private Session session;

    public ViagemDAO(Session session) {
        this.session = session;
    }

    public void salva(Viagem v) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(v);
        tx.commit();
    }

    public void remove(Viagem v) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(v);
        tx.commit();
    }

    public void atualiza(Viagem v) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(v);
        tx.commit();
    }
    
    public Viagem procura(int numero) {
        return (Viagem) 
                this.session.load(Viagem.class, numero);
    }

    public List<Viagem> listaTudo() {
        return this.session.createCriteria(
                Viagem.class).list();
    }
    
    public List<Viagem> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Viagem.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Viagem> listaviagens(int numero){
        return session.createQuery(
                "from viagem where numero>"+numero).list();
    }

    public List <Viagem> listaviagensSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Viagem.class).list();
    }
}
