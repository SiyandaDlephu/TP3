/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.WithdrawAccount;
import com.siyanda.classprinciples.service.crud.WithdrawAccountCrudService;
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
public class WIthdrawAccTestCrudService {
    
    public WIthdrawAccTestCrudService() {
    }

 
    @Mock
    WithdrawAccountCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(WithdrawAccountCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
          WithdrawAccount wc = new WithdrawAccount.WithAccountt().id("33").account();
        WithdrawAccount returnCardValidation = crudService.persist(wc);
        when(crudService.persist(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(wc);
    }

    @Test
    public void testRead() throws Exception {
         WithdrawAccount wc = new WithdrawAccount.WithAccountt().id("33").account();
        WithdrawAccount returnCardValidation = crudService.find(wc.getId());
        when(crudService.find(wc.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(wc.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        WithdrawAccount wc = new WithdrawAccount.WithAccountt().id("33").account();

        WithdrawAccount returnCardValidation = crudService.merge(wc);
        when(crudService.merge(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(wc);
    }

    @Test
    public void testDelete() throws Exception {

        WithdrawAccount wc = new WithdrawAccount.WithAccountt().id("33").account();
        WithdrawAccount returnCardValidation = crudService.remove(wc);
        when(crudService.remove(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(wc);
    }
}
