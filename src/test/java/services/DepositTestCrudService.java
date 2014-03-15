/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.Deposite;
import com.siyanda.classprinciples.service.crud.DepositCrudService;
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
public class DepositTestCrudService {
    
    public DepositTestCrudService() {
    }

      @Mock
    DepositCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepositCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Deposite dp = new Deposite.Depo().id("55").posit();
        Deposite returnCardValidation = crudService.persist(dp);
        when(crudService.persist(dp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(dp);


    }

    @Test
    public void testRead() throws Exception {
        Deposite dp = new Deposite.Depo().id("55").posit();
        Deposite returnCardValidation = crudService.find(dp.getId());
        when(crudService.find(dp.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(dp.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       Deposite dp = new Deposite.Depo().id("55").posit();

        Deposite returnCardValidation = crudService.merge(dp);
        when(crudService.merge(dp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(dp);

    }

    @Test
    public void testDelete() throws Exception {

       Deposite dp = new Deposite.Depo().id("55").posit();
        Deposite returnCardValidation = crudService.remove(dp);
        when(crudService.remove(dp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(dp);

    }
}
