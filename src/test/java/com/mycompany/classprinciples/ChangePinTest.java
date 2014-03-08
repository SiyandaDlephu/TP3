/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.ChangePin;
import org.testng.Assert;
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
public class ChangePinTest {
    
    public ChangePinTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void creatTest() 
     {
         ChangePin cp = new ChangePin.Change(123456).newPin(654321).id("50").changeP();
         Assert.assertEquals(cp.getId(), "50");
         Assert.assertEquals(cp.getOldPin(), 123456);
         Assert.assertEquals(cp.getNewPin(), 654321);
     }
     
     @Test
     public void creatUpdate() 
     {
         ChangePin cp = new ChangePin.Change(101010).newPin(202020).id("60").changeP();
         Assert.assertEquals(cp.getId(), "60");
         Assert.assertEquals(cp.getOldPin(), 101010);
         Assert.assertEquals(cp.getNewPin(), 202020);
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
