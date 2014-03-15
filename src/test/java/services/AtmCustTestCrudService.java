/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.Atm;
import com.siyanda.classprinciples.model.AtmCustomer;
import com.siyanda.classprinciples.service.crud.AtmCustCrudService;
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
public class AtmCustTestCrudService {
    
    public AtmCustTestCrudService() {
    }
   @Mock
    AtmCustCrudService crudService;
    
    @BeforeMethod
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AtmCustCrudService.class);
    }
    
      @Test
    public void testCreate() throws Exception {

        AtmCustomer atm = new AtmCustomer.Customer("Siyanda").accNumber(123456).id("30").atmcust();
        AtmCustomer returnAtm =  crudService.persist(atm);
        when(crudService.persist(atm)).thenReturn(returnAtm);
        Mockito.verify(crudService).persist(atm);

    }
    
    @Test
    public void testRead() throws Exception {
        AtmCustomer atm = new AtmCustomer.Customer("Siyanda").accNumber(123456).id("30").atmcust();
        AtmCustomer returnQuestion = crudService.find(atm.getId());
        when(crudService.find(atm.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(atm.getId());
    }
    
     @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
        
        

       AtmCustomer atm = new AtmCustomer.Customer("Siyanda")
               .accNumber(123456)
               .id("30")
               .atmcust();
       
//       AtmCustomer atmUpdate = new AtmCustomer.Customer(null)

        AtmCustomer returnQuestion = crudService.merge(atm);
        when(crudService.merge(atm)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(atm);

    }
    
    @Test
    public void testDelete() throws Exception {

        AtmCustomer atm = new AtmCustomer.Customer("Siyanda").accNumber(123456).id("30").atmcust();
        AtmCustomer returnQuestion = crudService.remove(atm);
        when(crudService.remove(atm)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(atm);

    }
}
