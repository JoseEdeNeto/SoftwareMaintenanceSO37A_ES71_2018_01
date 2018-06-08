/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Onibus;
import ClassesDAO.OnibusDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook
 
public class OnibusTest {
    Onibus bus = new Onibus();
    //OnibusDAO dao = new OnibusDAO();
    long id = 00;
    
    @Test
    public void testSalvarOnibus(){
        bus.setId(id);
        bus.setNumero(123);
        bus.setPlaca("ABC123");
        bus.setQtdlugar(45);
        bus.setViagens(null);
  
        dao.salva(bus);
        
        Assert.assertNotNull(dao.procura(id));
    }
    
    @Test
    public void testBuscaOnibus(){
        Assert.assertNotNull(dao.procura(id));
    }
    
    @Test
    public void testBuscaTodosOnibus(){
        Assert.assertNotNull(dao.listaTudo());
    }
    
    @Test
    public void testRemoveOnibus(){
        dao.remove(bus);
        Assert.assertNull(dao.procura(id));
    }
}
*/