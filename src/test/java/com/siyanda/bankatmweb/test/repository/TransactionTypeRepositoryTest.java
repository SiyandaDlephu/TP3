/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.BalanceInquery;
import com.siyanda.bankatmweb.domain.TransactionType;
import com.siyanda.bankatmweb.domain.TransanctionSlip;
import com.siyanda.bankatmweb.repository.TransactionTypeRepository;
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
public class TransactionTypeRepositoryTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private TransactionTypeRepository repo;
    
    public TransactionTypeRepositoryTest() {
    }

    @Test
    public void createTransacitonType()
    {
        repo = ctx.getBean(TransactionTypeRepository.class);
        
        BalanceInquery balance = new BalanceInquery
                .BalanceInqueryInner("Inathi")
                .balance(200.00)
                .balanceinquery();
        
        TransanctionSlip slip = new TransanctionSlip
                .TransanctionSlipInner("12:32")
                .amount(50.00)
                .transactionTypes("withdraw")
                .transactionslip();
        
        TransactionType type = new TransactionType
                .TransactionTypeInner("12:30")
               .transaction("withdraw")
                .date("12 jan 2014")
                .balanceinquery(balance)
                .transactionslip(slip)
                .transactiontype();
        
        repo.save(type);
        id = type.getId();
        Assert.assertNotNull(type);
                
    }
    
    @Test(dependsOnMethods="createTransacitonType")
    public void readTransactionTye()
    {
        repo = ctx.getBean(TransactionTypeRepository.class);
        TransactionType type = repo.findOne(id);
        Assert.assertEquals(type.getTime(), "12:30");
    }
    
    @Test(dependsOnMethods="readTransactionTye")
    public void updateTransactionType()
    {
        repo = ctx.getBean(TransactionTypeRepository.class);
        TransactionType type  = repo.findOne(id);
        TransactionType updateTransaction = new TransactionType
                .TransactionTypeInner("12:30")
                .transactiotypeinner(type)
                .transaction("deposit")
                .date("13 jan 2014")
                .transactiontype();
        
        repo.save(updateTransaction);
        
        TransactionType newTransaction = repo.findOne(id);
        Assert.assertEquals(newTransaction.getTime(), "12:30");
    }
    
    @Test(dependsOnMethods="updateTransactionType")
    public void deleteTransactionType()
    {
        repo = ctx.getBean(TransactionTypeRepository.class);
        TransactionType type = repo.findOne(id);
        repo.delete(type);
        
        TransactionType deletedTransaction = repo.findOne(id);
        Assert.assertNull(deletedTransaction);
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
