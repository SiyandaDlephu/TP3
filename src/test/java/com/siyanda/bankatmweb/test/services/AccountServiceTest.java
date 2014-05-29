/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.repository.AccountRepository;
import com.siyanda.bankatmweb.services.AccountService;
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
public class AccountServiceTest {
    
    private static ApplicationContext ctx;
    private AccountService accountservice;
     private AccountRepository accountrepository;
    
    public AccountServiceTest() {
    }

    @Test
    public void getSavingsAccount()
    {
        accountrepository = ctx.getBean(AccountRepository.class);
        accountservice = ctx.getBean(AccountService.class);
        
        Account act1 = new Account.AccountInner("12233")
                .accType("Savings")
                .account();
        Account act2 = new Account.AccountInner("122334444")
                .accType("cheque")
                .account();
        Account act3 = new Account.AccountInner("4444333221")
                .accType("credit")
                .account();
 
        
        accountrepository.save(act1);
        accountrepository.save(act2);
        accountrepository.save(act3);
        
        List<Account> account = accountservice.getCreditAccount("credit");
        Assert.assertEquals(account.size(), 3);
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
          accountrepository = ctx.getBean(AccountRepository.class);
       accountrepository.deleteAll();
    }
}
