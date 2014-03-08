/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.BuyAirtime;
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
public class BuyAirtimeTest {
    
    public BuyAirtimeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void creatTest() 
     {
         BuyAirtime bt = new BuyAirtime.BuyAir("07123456").id("22").airtime();
         Assert.assertEquals(bt.getId(), "22");
         Assert.assertEquals(bt.getPhoneNum(), "07123456");
         Assert.assertEquals(bt.excecute(120.00), 120.00);
     }

    @Test
     public void creatUpdate() 
     {
         BuyAirtime bt = new BuyAirtime.BuyAir("0101010").id("23").airtime();
         Assert.assertEquals(bt.getId(), "23");
         Assert.assertEquals(bt.getPhoneNum(), "0101010");
         Assert.assertEquals(bt.excecute(120.00), 120.00);
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
