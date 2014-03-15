/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.CardExpired;
import com.siyanda.classprinciples.service.crud.CardExpiredCrudService;
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
public class CardExpiredTestCrudService {
    
    public CardExpiredTestCrudService() {
    }
  @Mock
    CardExpiredCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CardExpiredCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        CardExpired e = new CardExpired.CheckCard().id("55").expired();
        CardExpired returnCardExpired = crudService.persist(e);
        when(crudService.persist(e)).thenReturn(returnCardExpired);
        Mockito.verify(crudService).persist(e);


    }

    @Test
    public void testRead() throws Exception {
        CardExpired e = new CardExpired.CheckCard().id("55").expired();
        CardExpired returnCardExpired = crudService.find(e.getId());
        when(crudService.find(e.getId())).thenReturn(returnCardExpired);
        Mockito.verify(crudService).find(e.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       CardExpired e = new CardExpired.CheckCard().id("55").expired();

        CardExpired returnCardExpired = crudService.merge(e);
        when(crudService.merge(e)).thenReturn(returnCardExpired);
        Mockito.verify(crudService).merge(e);

    }

    @Test
    public void testDelete() throws Exception {

        CardExpired e = new CardExpired.CheckCard().id("55").expired();
        CardExpired returnCardExpired = crudService.remove(e);
        when(crudService.remove(e)).thenReturn(returnCardExpired);
        Mockito.verify(crudService).remove(e);

    }
}
