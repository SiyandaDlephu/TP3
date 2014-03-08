/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.CardValidation;
import junit.framework.Assert;
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
public class CardValidationTest  {
    
    public CardValidationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createTest() 
     {
         CardValidation cd = new CardValidation.Validation(123456).id("70").card();
         Assert.assertEquals(cd.getPinNum(), 123456);
         Assert.assertEquals(cd.getId(), "70");
     }
     
     @Test
     public void createUespdate() 
     {
         CardValidation cd = new CardValidation.Validation(987654).id("80").card();
         Assert.assertEquals(cd.getPinNum(), 987654);
         Assert.assertEquals(cd.getId(), "80");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
