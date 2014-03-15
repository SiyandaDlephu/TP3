/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.Screen;
import com.siyanda.classprinciples.service.crud.ScreenCrudService;
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
public class ScreenTestCrudService {
    
    public ScreenTestCrudService() {
    }

 
    @Mock
    ScreenCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ScreenCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
         Screen s = new Screen.DisplayMessageIn("Siyanda").id("20").screen();
        Screen returnCardValidation = crudService.persist(s);
        when(crudService.persist(s)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(s);
    }

    @Test
    public void testRead() throws Exception {
        Screen s = new Screen.DisplayMessageIn("Siyanda").id("20").screen();
        Screen returnCardValidation = crudService.find(s.getId());
        when(crudService.find(s.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(s.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       Screen s = new Screen.DisplayMessageIn("Siyanda").id("20").screen();

        Screen returnCardValidation = crudService.merge(s);
        when(crudService.merge(s)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(s);
    }

    @Test
    public void testDelete() throws Exception {

       Screen s = new Screen.DisplayMessageIn("Siyanda").id("20").screen();
        Screen returnCardValidation = crudService.remove(s);
        when(crudService.remove(s)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(s);
    }
}
