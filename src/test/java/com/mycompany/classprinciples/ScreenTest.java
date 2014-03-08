/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.Screen;
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
public class ScreenTest {
    
    public ScreenTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CreatTest() 
     {
         Screen s = new Screen.DisplayMessageIn("Siyanda").id("20").screen();
         Assert.assertEquals(s.getId(), "20");
         Assert.assertEquals(s.getMessage(), "Siyanda");
         
     }
     
     @Test
     public void CreateUpdate() 
     {
         Screen s = new Screen.DisplayMessageIn("hilary").id("10").screen();
         Assert.assertEquals(s.getId(), "10");
         Assert.assertEquals(s.getMessage(), "hilary");
         
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
