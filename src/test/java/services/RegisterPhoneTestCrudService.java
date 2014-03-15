/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.RegisterPhone;
import com.siyanda.classprinciples.service.crud.RegisterPhoneCrudService;
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
public class RegisterPhoneTestCrudService {
    
    public RegisterPhoneTestCrudService() {
    }

    @Mock
    RegisterPhoneCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RegisterPhoneCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         RegisterPhone rp = new RegisterPhone.PhoneNumber("07123456").id("90").phone();
        RegisterPhone returnCardValidation = crudService.persist(rp);
        when(crudService.persist(rp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(rp);

    }

    @Test
    public void testRead() throws Exception {
        RegisterPhone rp = new RegisterPhone.PhoneNumber("07123456").id("90").phone();
        RegisterPhone returnCardValidation = crudService.find(rp.getId());
        when(crudService.find(rp.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(rp.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       RegisterPhone rp = new RegisterPhone.PhoneNumber("07123456").id("90").phone();

        RegisterPhone returnCardValidation = crudService.merge(rp);
        when(crudService.merge(rp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(rp);

    }

    @Test
    public void testDelete() throws Exception {

       RegisterPhone rp = new RegisterPhone.PhoneNumber("07123456").id("90").phone();
        RegisterPhone returnCardValidation = crudService.remove(rp);
        when(crudService.remove(rp)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(rp);

    }
}
