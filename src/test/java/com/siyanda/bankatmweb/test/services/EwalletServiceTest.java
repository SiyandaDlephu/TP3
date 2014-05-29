/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Ewallet;
import com.siyanda.bankatmweb.repository.EwalletRepository;
import com.siyanda.bankatmweb.services.EwalletService;
import static com.siyanda.bankatmweb.test.services.BankServiceTest.ctx;
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
public class EwalletServiceTest {
    
    public static ApplicationContext ctx;
    
    private EwalletRepository ewalletRepository;
    private EwalletService ewalletService;
    
    public EwalletServiceTest() {
    }
    
    @Test
    public void ewalletWithdraw()
    {
        ewalletRepository = ctx.getBean(EwalletRepository.class);
        ewalletService = ctx.getBean(EwalletService.class);
        
        Ewallet wallet1 = new Ewallet
                .EwalletInner("0721234567")
                .withdraw(250.00)
                .ewallet();
        Ewallet wallet2 = new Ewallet
                .EwalletInner("0712345678")
                .withdraw(350.00)
                .ewallet();
        Ewallet wallet3 = new Ewallet
                .EwalletInner("0719875421")
                .withdraw(450.00)
                .ewallet();
        
        ewalletRepository.save(wallet1);
        ewalletRepository.save(wallet2);
        ewalletRepository.save(wallet3);
        
        List<Ewallet> wallet = ewalletService.withdraw(350.00);
        Assert.assertEquals(wallet.size(), 3);
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
        ewalletRepository = ctx.getBean(EwalletRepository.class);
        ewalletRepository.deleteAll();
    }
}
