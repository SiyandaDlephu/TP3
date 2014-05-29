/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Ewallet;
import com.siyanda.bankatmweb.domain.LostCards;
import com.siyanda.bankatmweb.repository.EwalletRepository;
import static com.siyanda.bankatmweb.test.repository.TransactionTypeRepositoryTest.ctx;
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
public class EwalletRepositoryTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private EwalletRepository repo;
    
    public EwalletRepositoryTest() {
    }
    
     @Test
    public void createEwallet()
    {
         repo = ctx.getBean(EwalletRepository.class);
        
         LostCards lostcard = new LostCards
                 .LostCardsInner("90091515")
                 .cardNumber("001122")
                 .lostcards();
         
        Ewallet ewallet = new Ewallet
                .EwalletInner("0723456789")
                .password("3332211")
                .withdraw(100.00)
                .lostcards(lostcard)
                .ewallet();
        
        repo.save(ewallet);
        id = ewallet.getId();
        Assert.assertNotNull(ewallet);
    }

    @Test(dependsOnMethods="createEwallet")
    public void readEwallet()
    {
        repo = ctx.getBean(EwalletRepository.class);
        Ewallet ewallet = repo.findOne(id);
        Assert.assertEquals(ewallet.getPhoneNumber(), "0723456789");
    }
    
     @Test(dependsOnMethods="readEwallet")
    public void updateEwallet()
    {
        repo = ctx.getBean(EwalletRepository.class);
        
         
         LostCards lostcard = new LostCards
                 .LostCardsInner("90091515")
                 .cardNumber("001122")
                 .lostcards();
        
        Ewallet ewallet  = repo.findOne(id);
        Ewallet updateEwallet = new Ewallet
                .EwalletInner("0712589474")
               // .ewlletinner(ewallet)
                .lostcards(lostcard)
                .password("444422")
                .withdraw(150.00)
                .ewallet();
        
        repo.save(updateEwallet);
        
        Ewallet newEwallet = repo.findOne(id);
        Assert.assertEquals(newEwallet.getPhoneNumber(),"0723456789");        
    }
    
    @Test(dependsOnMethods="updateEwallet")
    public void deleteEwallet()
    {
        repo = ctx.getBean(EwalletRepository.class);
        Ewallet ewallet  = repo.findOne(id);
        repo.delete(ewallet);
        
        Ewallet deletedEwallet = repo.findOne(id);
        Assert.assertNull(deletedEwallet);
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
