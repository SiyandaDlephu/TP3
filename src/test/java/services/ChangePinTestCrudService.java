/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.ChangePin;
import com.siyanda.classprinciples.service.crud.impl.ChangePinCrudServiceImpl;
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
public class ChangePinTestCrudService {
    
    public ChangePinTestCrudService() {
    }

    @Mock
    ChangePinCrudServiceImpl crudService;
    
    @BeforeMethod
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ChangePinCrudServiceImpl.class);
    }
    
      @Test
    public void testCreate() throws Exception {

        ChangePin cp = new ChangePin.Change(123456).newPin(654321).id("50").changeP();
        ChangePin returnAtm =  crudService.persist(cp);
        when(crudService.persist(cp)).thenReturn(returnAtm);
        Mockito.verify(crudService).persist(cp);

    }
    
    @Test
    public void testRead() throws Exception {
        ChangePin cp = new ChangePin.Change(123456).newPin(654321).id("50").changeP();
        ChangePin returnQuestion = crudService.find(cp.getId());
        when(crudService.find(cp.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(cp.getId());
    }
    
     @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       ChangePin cp = new ChangePin.Change(123456).newPin(654321).id("50").changeP();

        ChangePin returnQuestion = crudService.merge(cp);
        when(crudService.merge(cp)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(cp);

    }
    
    @Test
    public void testDelete() throws Exception {

        ChangePin cp = new ChangePin.Change(123456).newPin(654321).id("50").changeP();
        ChangePin returnQuestion = crudService.remove(cp);
        when(crudService.remove(cp)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(cp);

    }
}
