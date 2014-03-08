/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.EWalllet;
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
public class EwalletTest {
    
    public EwalletTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void testCreate()throws Exception
    {
        EWalllet e = new EWalllet.Wallet(1234).id("10").wal();
        Assert.assertEquals(e.getId(),"10");
       Assert.assertEquals(e.getCell(),1234);
    }
    
     @Test
    public void testUpdate()throws Exception
    {
        EWalllet e = new EWalllet.Wallet(0123456).id("20").wal();
        Assert.assertEquals(e.getId(),"20");
       Assert.assertEquals(e.getCell(),0123456);
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
