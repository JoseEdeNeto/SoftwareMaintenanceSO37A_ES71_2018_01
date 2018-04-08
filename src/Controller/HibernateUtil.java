package Controller;


import Classes.Motorista;
import Classes.Onibus;
import Classes.Passageiro;
import Classes.Viagem;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class HibernateUtil {
    private static SessionFactory factory;
    static {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        Set<String> stringPropertyNames = cfg.getProperties().stringPropertyNames();
        cfg.addAnnotatedClass(Passageiro.class);
        cfg.addAnnotatedClass(Onibus.class);
        cfg.addAnnotatedClass(Motorista.class);
        cfg.addAnnotatedClass(Viagem.class);
        factory = cfg.buildSessionFactory();
    }
    public static Session getSession() {
        return factory.openSession();
    }
}