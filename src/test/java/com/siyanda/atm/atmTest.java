package com.siyanda.atm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Siyanda.config.AtmConfig;
import Siyanda.service.Impl.SiyandaServiceImpl;
import Siyanda.service.SiyandaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class atmTest {
    
    private SiyandaService ss;
    
    public atmTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
         @Test

    // public void hello() {}
     
     
     public void balance()
     {
         double result = ss.balance(10.25);
         Assert.assertEquals(result,10.25);
     }
     
     @Test
     public void accountNumber()
     {
         int accNu = ss.accountNumber(125);
         Assert.assertEquals(125, 125);
     }
     
     @Test
     public void objectEquals()
     {
         String name = "inathi";
         String surname ="zenande";
         String both = (name + surname);
          
         Assert.assertEquals(both,"inathizenande");
     }
     
     @Test
     public void objectIdentity()
     {
         String name = "inathi";
         
         
         Assert.assertEquals(name, "inathi");
     }
     
     @Test
     public void truthWithdraw()
     {
         double bal = 12;
         Assert.assertTrue(true);
     }
     
     @Test
     public void falsityNoMoney()
     {
         Assert.assertFalse(false);
     }
     
     @Test
     public void nullPin()
     {
         Assert.assertNull(null);
     }
     
     @Test
     public void notNullPin()
     {
         int pin = 1010;
         Assert.assertNotNull(pin, null);
     }
     
     @Test
     public void failPin()
     {
          String pin ="101";
         Assert.fail(null);
     }

     
     @Test(timeOut = 25)
     public void timeout()
     {
         ss.timeout("timeout");
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        ApplicationContext c = new AnnotationConfigApplicationContext(AtmConfig.class);
        ss = (SiyandaService)c.getBean("balan");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
