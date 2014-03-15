/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.DepositSlot;
import com.siyanda.classprinciples.service.crud.DepositSlotCrudService;
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
public class DepositSlotTestCrudService {
    
    public DepositSlotTestCrudService() {
    }

   
      @Mock
    DepositSlotCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepositSlotCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        DepositSlot ds = new DepositSlot.Deposit().id("220").slot();
        DepositSlot returnCardValidation = crudService.persist(ds);
        when(crudService.persist(ds)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(ds);


    }

    @Test
    public void testRead() throws Exception {
        DepositSlot ds = new DepositSlot.Deposit().id("220").slot();
        DepositSlot returnCardValidation = crudService.find(ds.getId());
        when(crudService.find(ds.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(ds.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       DepositSlot ds = new DepositSlot.Deposit().id("220").slot();

        DepositSlot returnCardValidation = crudService.merge(ds);
        when(crudService.merge(ds)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(ds);

    }

    @Test
    public void testDelete() throws Exception {

       DepositSlot ds = new DepositSlot.Deposit().id("220").slot();
        DepositSlot returnCardValidation = crudService.remove(ds);
        when(crudService.remove(ds)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(ds);

    }
}
