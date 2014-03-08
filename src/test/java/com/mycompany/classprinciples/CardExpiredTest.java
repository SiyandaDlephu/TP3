/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.CardExpired;
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
public class CardExpiredTest {
    
    public CardExpiredTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createTest() 
     {
         
         CardExpired e = new CardExpired.CheckCard().id("55").expired();
        Assert.assertEquals(e.getId(),"55");
        Assert.assertFalse(false);
     }
     
 @Test
     public void createUpdate() 
     {
         
         CardExpired e = new CardExpired.CheckCard().id("56").expired();
        Assert.assertEquals(e.getId(),"56");
        Assert.assertFalse(false);
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
