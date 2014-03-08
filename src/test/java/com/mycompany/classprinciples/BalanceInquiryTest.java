/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.BalanceInquiry;
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
public class BalanceInquiryTest {
    
    public BalanceInquiryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   
    @Test
    public void testCreate()throws Exception
    {
       BalanceInquiry bq = new BalanceInquiry.BalanceInq("140").bala();
       Assert.assertEquals(bq.excecute(300.00), 220.00);
       Assert.assertEquals(bq.getId(), "140");
      
       
    }
    
    @Test
    public void testUpdate()throws Exception
    {
       BalanceInquiry bq = new BalanceInquiry.BalanceInq("141").bala();
       Assert.assertEquals(bq.excecute(300.00), 220.00);
       Assert.assertEquals(bq.getId(), "141");
      
       
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
