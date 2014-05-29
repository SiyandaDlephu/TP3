/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Bank;
import com.siyanda.bankatmweb.repository.BankRepository;
import com.siyanda.bankatmweb.services.BankService;
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
public class BankServiceTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private BankService bankService;
    private BankRepository bankRepository;
    
    @Test
    public void getBankName()
    {
        bankService = ctx.getBean(BankService.class);
        bankRepository = ctx.getBean(BankRepository.class);
        
        Bank bank1 = new Bank
                .BankInner("001bank")
                .bankName("firstNationalBank")
                .bank();
        Bank bank2 = new Bank
                .BankInner("002bank")
                .bankName("standardBank")
                .bank();
        
        bankRepository.save(bank1);
        bankRepository.save(bank2);
        
        List<Bank> banks = bankService.getBankName("firstNationalBank");
        Assert.assertEquals(banks.size(), 2);
    }
    
    public BankServiceTest() {
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
        bankRepository = ctx.getBean(BankRepository.class);
        bankRepository.deleteAll();
    }
}
