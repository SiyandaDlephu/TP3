/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.WithdrawCard;
import com.siyanda.classprinciples.service.crud.WithdrawCardCrudService;
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
public class WithdrawCardTestCrudService {
    
    public WithdrawCardTestCrudService() {
    }

   @Mock
    WithdrawCardCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(WithdrawCardCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         WithdrawCard wc = new WithdrawCard.WithCard().balance(1000.00).id("44").with();
        WithdrawCard returnCardValidation = crudService.persist(wc);
        when(crudService.persist(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(wc);
    }

    @Test
    public void testRead() throws Exception {
        WithdrawCard wc = new WithdrawCard.WithCard().balance(1000.00).id("44").with();
        WithdrawCard returnCardValidation = crudService.find(wc.getId());
        when(crudService.find(wc.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(wc.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       WithdrawCard wc = new WithdrawCard.WithCard().balance(1000.00).id("44").with();

        WithdrawCard returnCardValidation = crudService.merge(wc);
        when(crudService.merge(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(wc);
    }

    @Test
    public void testDelete() throws Exception {

       WithdrawCard wc = new WithdrawCard.WithCard().balance(1000.00).id("44").with();
        WithdrawCard returnCardValidation = crudService.remove(wc);
        when(crudService.remove(wc)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(wc);
    }
}
