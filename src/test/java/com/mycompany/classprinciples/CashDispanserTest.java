/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.CashDispanser;
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
public class CashDispanserTest {
    
    public CashDispanserTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createTest() 
     {
         CashDispanser cd = new CashDispanser.Dispanser("15").cash();
         Assert.assertEquals(cd.isSufficientCash(10.00), false);
         Assert.assertEquals(cd.getId(), "15");
         
     }
     
      @Test
     public void createUpdate() 
     {
         CashDispanser cd = new CashDispanser.Dispanser("16").cash();
         Assert.assertEquals(cd.isSufficientCash(10.00), false);
         Assert.assertEquals(cd.getId(), "16");
         
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
