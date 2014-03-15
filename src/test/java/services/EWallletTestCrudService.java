/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.EWalllet;
import com.siyanda.classprinciples.service.crud.EWallletCrudService;
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
public class EWallletTestCrudService {
    
    public EWallletTestCrudService() {
    }

  @Mock
    EWallletCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(EWallletCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        EWalllet e = new EWalllet.Wallet(1234).id("10").wal();
        EWalllet returnCardValidation = crudService.persist(e);
        when(crudService.persist(e)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(e);

    }

    @Test
    public void testRead() throws Exception {
        EWalllet e = new EWalllet.Wallet(1234).id("10").wal();
        EWalllet returnCardValidation = crudService.find(e.getId());
        when(crudService.find(e.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(e.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       EWalllet e = new EWalllet.Wallet(1234).id("10").wal();

        EWalllet returnCardValidation = crudService.merge(e);
        when(crudService.merge(e)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(e);

    }

    @Test
    public void testDelete() throws Exception {

       EWalllet e = new EWalllet.Wallet(1234).id("10").wal();
        EWalllet returnCardValidation = crudService.remove(e);
        when(crudService.remove(e)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(e);

    }
}
