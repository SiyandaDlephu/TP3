/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.Atm;
import com.siyanda.classprinciples.service.crud.AtmCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class AtmTestCrudService {
    
    public AtmTestCrudService() {
    }

    @Mock
    AtmCrudService crudService;
    
    @BeforeMethod
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AtmCrudService.class);
    }
    
      @Test
    public void testCreate() throws Exception {

        Atm a = new Atm.AtmInner(true).id("10").atm();
       // Atm a = new Atm.AtmInner(true).
        
        Atm returnAtm =  crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnAtm);
        Mockito.verify(crudService).persist(a);

    }
    
    @Test
    public void testRead() throws Exception {
        Atm a = new Atm.AtmInner(true).id("10").atm();
        Atm returnQuestion = crudService.find(a.getId());
        when(crudService.find(a.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(a.getId());
    }
    
     @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       Atm a = new Atm.AtmInner(true).id("10").atm();

        Atm returnQuestion = crudService.merge(a);
        when(crudService.merge(a)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(a);

    }
    
    @Test
    public void testDelete() throws Exception {

        Atm a = new Atm.AtmInner(true).id("10").atm();
        Atm returnQuestion = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(a);

    }
}
