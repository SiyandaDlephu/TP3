/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmWeb.test.services;

//import static com.siyanda.atmWeb.test.services.TotalAccountSavingsTest.ctx;
import com.siyanda.atmweb.app.conf.ConnectionConfig;
import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.services.TotalAtmCustomerService;
import java.util.List;
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
 * @author inathi-zenande
 */
public class TotalAtmCustomerServiceTest {
    public static ApplicationContext ctx;
    
    private TotalAtmCustomerService service;
    
    public TotalAtmCustomerServiceTest() {
    }

    @Test
    public void totalAtmCustomer()
    {
        service = ctx.getBean(TotalAtmCustomerService.class);
        List<AtmCustomer> atmcustomer = service.getTotalAtmCustomer();
        Assert.assertEquals(0, atmcustomer.size(),"Expected num accounts");
  
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    
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
