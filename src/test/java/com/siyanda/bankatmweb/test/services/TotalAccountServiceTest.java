/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.services.TotalAccountService;
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
public class TotalAccountServiceTest {
    
     public static ApplicationContext ctx;
     
     private TotalAccountService service;
    
    public TotalAccountServiceTest() {
    }

   @Test
   public void totalAccounts()
   {
       service = ctx.getBean(TotalAccountService.class);
       List<Account> account = service.getTotalAccount();
       
       Assert.assertEquals(0, account.size(), " Expected number of accounts");
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
