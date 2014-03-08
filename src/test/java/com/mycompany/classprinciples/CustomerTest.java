/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.AtmCustomer;
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
public class CustomerTest {
    
    public CustomerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void creatTest() 
     {
         AtmCustomer atm = new AtmCustomer.Customer("Siyanda").accNumber(123456).id("30").atmcust();
         Assert.assertEquals(atm.getId(), "30");
         Assert.assertEquals(atm.getName(), "Siyanda");
         Assert.assertEquals(atm.getAccNumber(), 123456);
     }
     
     @Test
     public void createUpdate() 
     {
         AtmCustomer atm = new AtmCustomer.Customer("hilary").accNumber(654321).id("40").atmcust();
         Assert.assertEquals(atm.getId(), "40");
         Assert.assertEquals(atm.getName(), "hilary");
         Assert.assertEquals(atm.getAccNumber(), 654321);
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
