/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.siyanda.classprinciples.model.CardValidation;
import com.siyanda.classprinciples.service.crud.CardLessCrudService;
import com.siyanda.classprinciples.service.crud.CardValiCrudService;
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
public class CardValidationTestCrudService {
    
    public CardValidationTestCrudService() {
    }
    
    @Mock
    CardValiCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CardValiCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
       CardValidation cd = new CardValidation.Validation(123456).id("70").card();
        CardValidation returnCardValidation = crudService.persist(cd);
        when(crudService.persist(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).persist(cd);


    }

    @Test
    public void testRead() throws Exception {
       CardValidation cd = new CardValidation.Validation(123456).id("70").card();
        CardValidation returnCardValidation = crudService.find(cd.getId());
        when(crudService.find(cd.getId())).thenReturn(returnCardValidation);
        Mockito.verify(crudService).find(cd.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       CardValidation cd = new CardValidation.Validation(123456).id("70").card();

        CardValidation returnCardValidation = crudService.merge(cd);
        when(crudService.merge(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).merge(cd);

    }

    @Test
    public void testDelete() throws Exception {

       CardValidation cd = new CardValidation.Validation(123456).id("70").card();
        CardValidation returnCardValidation = crudService.remove(cd);
        when(crudService.remove(cd)).thenReturn(returnCardValidation);
        Mockito.verify(crudService).remove(cd);

    }
}
