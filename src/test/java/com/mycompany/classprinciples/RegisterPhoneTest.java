/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classprinciples;

import com.siyanda.classprinciples.model.RegisterPhone;
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
public class RegisterPhoneTest {
    
    public RegisterPhoneTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createTest() 
     {
         RegisterPhone rp = new RegisterPhone.PhoneNumber("07123456").id("90").phone();
         Assert.assertEquals(rp.getId(), "90");
         Assert.assertEquals(rp.getPhoneNum(), "07123456");
     }
     
     @Test
     public void createUpdate() 
     {
         RegisterPhone rp = new RegisterPhone.PhoneNumber("07987654").id("100").phone();
         Assert.assertEquals(rp.getId(), "100");
         Assert.assertEquals(rp.getPhoneNum(), "07987654");
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
