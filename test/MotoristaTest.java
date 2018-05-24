/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Motorista;
import ClassesDAO.MotoristaDAO;
import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

/**
 *
 * @author Notebook
 */
public class MotoristaTest {
    Motorista mot = new Motorista();
    MotoristaDAO dao = new MotoristaDAO();
        
        long id = 00;
    
    @Test
    public void testSalvarrMotorista(){
        mot.setCnh(00000000);
        mot.setEndereco("Rua Test...");
        mot.setId(id);
        mot.setNome("Jeff Test");
        mot.setTelefone(99999999);
        mot.setViagens(null);
        
        dao.salva(mot);
        Assert.assertNotNull(dao.procura(id));
    }
    
    @Test
    public void testBuscaMotorista(){
        Assert.assertNotNull(dao.procura(id));
    }
    
    @Test
    public void testBuscaTudoMotorista(){
        Assert.assertNotNull(dao.listaTudo());
    }
    
    @Test
    public void testMotorista(){
        mot.setNome("Nome Atualizado");
        dao.atualiza(mot);
        Assert.assertEquals("Nome Atualizado", mot.getNome());
    }
    
    @Test
    public void testDeleteMotorista(){
        dao.remove(mot);
        Assert.assertNull(dao.procura(id));
    }
}
