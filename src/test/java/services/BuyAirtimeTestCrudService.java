/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.BuyAirtime;
import com.siyanda.classprinciples.service.crud.BuyAirtimeCrudService;
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
public class BuyAirtimeTestCrudService {
    
    public BuyAirtimeTestCrudService() {
    }

    @Mock
    BuyAirtimeCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BuyAirtimeCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         BuyAirtime bt = new BuyAirtime.BuyAir("07123456").id("22").airtime();
        BuyAirtime returnBuyAirtime = crudService.persist(bt);
        when(crudService.persist(bt)).thenReturn(returnBuyAirtime);
        Mockito.verify(crudService).persist(bt);


    }

    @Test
    public void testRead() throws Exception {
         BuyAirtime bt = new BuyAirtime.BuyAir("07123456").id("22").airtime();
        BuyAirtime returnBuyAirtime = crudService.find(bt.getId());
        when(crudService.find(bt.getId())).thenReturn(returnBuyAirtime);
        Mockito.verify(crudService).find(bt.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         BuyAirtime bt = new BuyAirtime.BuyAir("07123456").id("22").airtime();

        BuyAirtime returnBuyAirtime = crudService.merge(bt);
        when(crudService.merge(bt)).thenReturn(returnBuyAirtime);
        Mockito.verify(crudService).merge(bt);

    }

    @Test
    public void testDelete() throws Exception {

         BuyAirtime bt = new BuyAirtime.BuyAir("07123456").id("22").airtime();
        BuyAirtime returnBuyAirtime = crudService.remove(bt);
        when(crudService.remove(bt)).thenReturn(returnBuyAirtime);
        Mockito.verify(crudService).remove(bt);

    }
}
