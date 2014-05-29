/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Bank;
import com.siyanda.bankatmweb.repository.BankRepository;
import static com.siyanda.bankatmweb.test.repository.AccountRepositoryTest.ctx;
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
public class BankRepositoryTest {
     public static ApplicationContext ctx;
    
    private Long id;
    private BankRepository repo;
    
    public BankRepositoryTest() {
    }
    
     @Test
   public void createBank()
   {
       repo = ctx.getBean(BankRepository.class);
       Bank bank =  new Bank
               .BankInner("bank100")
               .bankName("capitech")
               .location("Cape town")
               .bank();
       
       repo.save(bank);
       id = bank.getId();
       Assert.assertNotNull(bank);
   }
   
   @Test(dependsOnMethods="createBank")
   public void readBank()
   {
       repo = ctx.getBean(BankRepository.class);
       Bank bank = repo.findOne(id);
       Assert.assertEquals(bank.getBankNumber(), "bank100");
   }
   @Test(dependsOnMethods="readBank")
   public void updateBank()
   {
       repo = ctx.getBean(BankRepository.class);
       Bank bank = repo.findOne(id);
       Bank updatedBank = new Bank
               .BankInner("bank200")
               .bankName("capitech")
               .location("Cape town")
               .bank();
       
       repo.save(updatedBank);
       Bank newBank = repo.findOne(id);
       Assert.assertEquals(newBank.getBankNumber(), "bank100");
   }
    
   @Test(dependsOnMethods="updateBank")
   public void deleteBank()
   {
       repo = ctx.getBean(BankRepository.class);
       Bank bank = repo.findOne(id);
      repo.delete(bank);
       
       Bank deletedBank = repo.findOne(id);
       Assert.assertNull(deletedBank);
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
