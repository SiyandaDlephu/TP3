/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.CardValidation;
import com.siyanda.classprinciples.model.CashDispanser;
import com.siyanda.classprinciples.service.crud.CashDispanserCrudService;
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
public class CashDispanserTestCrudService {
    
    public CashDispanserTestCrudService() {
    }

      @Mock
    CashDispanserCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CashDispanserCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
       CashDispanser cd = new CashDispanser.Dispanser(10.00).id("15").cash();
        CashDispanser returnCardValidation = crudService.persist(cd);
        when(crudService.persist(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(cd);


    }

    @Test
    public void testRead() throws Exception {
       CashDispanser cd = new CashDispanser.Dispanser(10.00).id("15").cash();
        CashDispanser returnCardValidation = crudService.find(cd.getId());
        when(crudService.find(cd.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(cd.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

      CashDispanser cd = new CashDispanser.Dispanser(10.00).id("15").cash();

        CashDispanser returnCardValidation = crudService.merge(cd);
        when(crudService.merge(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(cd);

    }

    @Test
    public void testDelete() throws Exception {

      CashDispanser cd = new CashDispanser.Dispanser(10.00).id("15").cash();
        CashDispanser returnCardValidation = crudService.remove(cd);
        when(crudService.remove(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(cd);

    }
}
