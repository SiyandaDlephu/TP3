/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.Withdraw;
import com.siyanda.classprinciples.service.crud.WithdrawCrudService;
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
public class WIthdrawTestCrudService {
    
    public WIthdrawTestCrudService() {
    }

   @Mock
    WithdrawCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(WithdrawCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         Withdraw w = new Withdraw.Money(true).id("10").cash();
        Withdraw returnCardValidation = crudService.persist(w);
        when(crudService.persist(w)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(w);
    }

    @Test
    public void testRead() throws Exception {
        Withdraw w = new Withdraw.Money(true).id("10").cash();
        Withdraw returnCardValidation = crudService.find(w.getId());
        when(crudService.find(w.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(w.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       Withdraw w = new Withdraw.Money(true).id("10").cash();

        Withdraw returnCardValidation = crudService.merge(w);
        when(crudService.merge(w)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(w);
    }

    @Test
    public void testDelete() throws Exception {

       Withdraw w = new Withdraw.Money(true).id("10").cash();
        Withdraw returnCardValidation = crudService.remove(w);
        when(crudService.remove(w)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(w);
    }
}
