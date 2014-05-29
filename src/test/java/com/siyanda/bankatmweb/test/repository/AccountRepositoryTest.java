/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.domain.Cheque;
import com.siyanda.bankatmweb.domain.Credit;
import com.siyanda.bankatmweb.domain.Savings;
import com.siyanda.bankatmweb.repository.AccountRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class AccountRepositoryTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private AccountRepository repo;
    private Account account;
    
    private static Savings save;
    private static Cheque cheque;
    private static Credit credit;
    
    public AccountRepositoryTest() {
    }

   @Test
   public void createAccount()
   {
       repo = ctx.getBean(AccountRepository.class);
       
       
           credit = new Credit
               .CreditInner("02 sep 2014")
               .amount2(15000.00)
               .interestRate2(25.00)
               .credit();
     
            save = new Savings
               .SavingsInner("01 sep 2014")
               .amount(500.00)
               .intresteRate(30.00)
               .savings();
       
       cheque = new Cheque
               .ChequeInner("12 sep 2014")
               .money(150.00)
               .interestRate(35.00)
               .check();
       
      account = new Account
               .AccountInner("7420")
               .accType("Savings")
               .accHolder("sibusiso")
               .savings(save)
               .cheque(cheque)
               .credit(credit)
               .account();
       
       
       repo.save(account);
       id = account.getId();
       Assert.assertNotNull(account);
   }
   
   @Test(dependsOnMethods="createAccount")
   public void readAccount()
   {
       repo = ctx.getBean(AccountRepository.class);
       Account account = repo.findOne(id);
       Assert.assertEquals(account.getAccType(), "Savings");
   }
    
   @Test(dependsOnMethods="readAccount")
   public void updateAccount()
   {
       repo = ctx.getBean(AccountRepository.class);
       Account accounts = repo.findOne(id);
       
       Account updateAccount = new Account
                .AccountInner("7420")
               .accType("Cheque")
               .accHolder("sibusiso")
               .savings(save)
               .cheque(cheque)
              .credit(credit)
               .account();
       
       repo.save(updateAccount);
       
       Account newAccount = repo.findOne(id);
       Assert.assertEquals(newAccount.getAccType(), "Savings");
   }
   
   @Test(dependsOnMethods="updateAccount")
   public void deleteAccount()
   {
       repo = ctx.getBean(AccountRepository.class);
       Account account = repo.findOne(id);
       repo.delete(account);
       
       Account deletedAccount = repo.findOne(id);
       Assert.assertNull(deletedAccount);
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
