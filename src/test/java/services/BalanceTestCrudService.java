/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.BalanceInquiry;
import com.siyanda.classprinciples.service.crud.BalanceInquCrudService;
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
public class BalanceTestCrudService {
    
    public BalanceTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

      @Mock
    BalanceInquCrudService crudService;

      
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BalanceInquCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         BalanceInquiry bq = new BalanceInquiry.BalanceInq("140").bala();
        BalanceInquiry returnQuestion = crudService.persist(bq);
        when(crudService.persist(bq)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(bq);
    }

    @Test
    public void testRead() throws Exception {
         BalanceInquiry bq = new BalanceInquiry.BalanceInq("140").bala();
        BalanceInquiry returnQuestion = crudService.find(bq.getId());
        when(crudService.find(bq.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(bq.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         BalanceInquiry bq = new BalanceInquiry.BalanceInq("140").bala();

        BalanceInquiry returnQuestion = crudService.merge(bq);
        when(crudService.merge(bq)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(bq);

    }

    @Test
    public void testDelete() throws Exception {

        BalanceInquiry bq = new BalanceInquiry.BalanceInq("140").bala();
        BalanceInquiry returnQuestion = crudService.remove(bq);
        when(crudService.remove(bq)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(bq);

    }
}
