/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.Atm;
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
public class AtmTest {
    
    public AtmTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createTest() 
     {
         Atm a = new Atm.AtmInner(true).id("10").atm();
         Assert.assertEquals(a.getId(), "10");
         Assert.assertTrue(a.isUserAuthorized());
     }
     
     @Test
     public void createUpdate() 
     {
         Atm a = new Atm.AtmInner(false).id("20").atm();
         Assert.assertEquals(a.getId(), "20");
         Assert.assertFalse(a.isUserAuthorized());
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
