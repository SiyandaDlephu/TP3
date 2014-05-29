/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.DeletedAccounts;
import com.siyanda.bankatmweb.repository.DeletedAccountsRepository;
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
public class DeletedAccountsRepositoryTest {
    public static ApplicationContext ctx;
    
    private Long id;
    private DeletedAccountsRepository repo;
    
    public DeletedAccountsRepositoryTest() {
    }

    @Test
    public void createDeletedAccount()
    {
        repo = ctx.getBean(DeletedAccountsRepository.class);
        DeletedAccounts deletedaccounts = new DeletedAccounts
                .DeletedAccountsInner("123456789")
                .dateDeleted("02 sep 2014")
                .deletedaccounts();
        
        repo.save(deletedaccounts);
        id = deletedaccounts.getId();
        Assert.assertNotNull(deletedaccounts);
        
    }
    
    @Test(dependsOnMethods="createDeletedAccount")
    public void readDeletedAccount()
    {
        repo = ctx.getBean(DeletedAccountsRepository.class);
        DeletedAccounts deletedaccount = repo.findOne(id);
        Assert.assertEquals(deletedaccount.getAccountNumberdeleted(), "123456789");
    }
    
    @Test(dependsOnMethods="readDeletedAccount")
    public void updateDeletedAccount()
    {
        repo = ctx.getBean(DeletedAccountsRepository.class);
        DeletedAccounts deleteAccount = repo.findOne(id);
        DeletedAccounts updatedDeletedAccount = new DeletedAccounts
                .DeletedAccountsInner("987654321")
                .dateDeleted("03 sep 2014")
                .deletedaccountinner(deleteAccount)
                .deletedaccounts();
        
        repo.save(updatedDeletedAccount);
        
        DeletedAccounts newDelete = repo.findOne(id);
        Assert.assertEquals(newDelete.getAccountNumberdeleted(), "123456789");
                
        
    }
    
    @Test(dependsOnMethods="updateDeletedAccount")
    public void deletedDeletedAccount()
    {
        repo = ctx.getBean(DeletedAccountsRepository.class);
        DeletedAccounts deletedaccounts =repo.findOne(id);
        repo.delete(deletedaccounts);
        
        DeletedAccounts deleted = repo.findOne(id);
        Assert.assertNull(deleted);
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
