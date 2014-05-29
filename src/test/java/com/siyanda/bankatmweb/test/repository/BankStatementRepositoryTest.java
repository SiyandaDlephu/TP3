/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.BankStatement;
import com.siyanda.bankatmweb.repository.BankStatementRepository;
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
public class BankStatementRepositoryTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private BankStatementRepository repo;
    
    public BankStatementRepositoryTest() {
    }
    
    @Test
    public void createBankStatement()
    {
        repo = ctx.getBean(BankStatementRepository.class);
         BankStatement bank = new  BankStatement
                 .BankStatementInner("1223334444")
                 .accountType("savings")
                 .accountHolder("siyanda")
                 .bankLocation("woodstock")
                 .accountBalance(500.00)
                 .bankstatement();
         
         repo.save(bank);
         id = bank.getId();
         Assert.assertNotNull(bank);
    }
    
    @Test(dependsOnMethods="createBankStatement")
    public void readBankStatement()
    {
        repo = ctx.getBean(BankStatementRepository.class);
        BankStatement bank = repo.findOne(id);
        Assert.assertEquals(bank.getAccountNumber(), "1223334444");
    }

    @Test(dependsOnMethods="readBankStatement")
    public void updateBankStatement()
    {
        repo = ctx.getBean(BankStatementRepository.class);
        BankStatement bank = repo.findOne(id);
        BankStatement updateBankStatement = new BankStatement
                .BankStatementInner("4444333221")
                //.bankstatementinner(bank)
                .accountType("deposit")
                .accountHolder("rukara")
                .bankLocation("goodhood")
                .accountBalance(320.00)
                .bankstatement();
        
        repo.save(updateBankStatement);
        
        BankStatement newBankStatement = repo.findOne(id);
        Assert.assertEquals(newBankStatement.getAccountNumber(), "1223334444");
    }
    
    @Test(dependsOnMethods="updateBankStatement")
    public void deleteBankStatement()
    {
        repo = ctx.getBean(BankStatementRepository.class);
        BankStatement bank = repo.findOne(id);
        repo.delete(bank);
        
        BankStatement deletedBankStatement = repo.findOne(id);
        Assert.assertNull(deletedBankStatement);
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
