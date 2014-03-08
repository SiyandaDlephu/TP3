/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.WithdrawCard;
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
public class WithdrawCardTest {
    
    public WithdrawCardTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void creatTest()
     {
         WithdrawCard wc = new WithdrawCard.WithCard("44").with();
         Assert.assertEquals(wc.getId(), "44");
         Assert.assertEquals(wc.getBalance(), 1000.00);
         Assert.assertEquals(wc.excecute(1000.00), 1000.00);
     }
     
     @Test
     public void creatUpdate()
     {
         WithdrawCard wc = new WithdrawCard.WithCard("45").with();
         Assert.assertEquals(wc.getId(), "45");
         Assert.assertEquals(wc.getBalance(), 1000.00);
         Assert.assertEquals(wc.excecute(50.00), 50.00);
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
