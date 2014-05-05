///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmWeb.test.repository;
//
//import static com.siyanda.atmWeb.test.repository.AtmCustomerRepositoryTest.ctx;
//import com.siyanda.atmweb.app.conf.ConnectionConfig;
//import com.siyanda.atmweb.domain.Account;
//import com.siyanda.atmweb.repository.AccountRepository;
//import org.apache.derby.iapi.jdbc.ConnectionContext;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.testng.Assert;
//import static org.testng.Assert.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
///**
// *
// * @author inathi-zenande
// */
//public class AccountRepositoryTest {
//    
//    public static ApplicationContext ctx;
//    
//    private Long id;
//    private AccountRepository repo;
//    
//    public AccountRepositoryTest() {
//    }
//
//   @Test
//   public void createAccount()
//   {
//       repo = ctx.getBean(AccountRepository.class);
//       Account account = new Account
//               .AccountInner("1234")
//               .accType("Savings")
//               .account();
//       
//       repo.save(account);
//       id = account.getId();
//       Assert.assertNotNull(account);
//   }
//   
//   @Test(dependsOnMethods="createAccount")
//   public void readAccount()
//   {
//       repo = ctx.getBean(AccountRepository.class);
//       Account account = repo.findOne(id);
//       Assert.assertEquals(account.getAccType(), "Savings");
//   }
//    
//   @Test(dependsOnMethods="readAccount")
//   public void updateAccount()
//   {
//       repo = ctx.getBean(AccountRepository.class);
//       Account account = repo.findOne(id);
//       Account updateAccount = new Account
//               .AccountInner("1234321")
//               .accType("Check")
//               .account();
//       
//       repo.save(updateAccount);
//       
//       Account newAccount = repo.findOne(id);
//       Assert.assertEquals(newAccount.getAccType(), "Check");
//   }
//   
//   @Test(dependsOnMethods="updateAccount")
//   public void deleteAccount()
//   {
//       repo = ctx.getBean(AccountRepository.class);
//       Account account = repo.findOne(id);
//       repo.delete(account);
//       
//       Account deletedAccount = repo.findOne(id);
//       Assert.assertNull(deletedAccount);
//   }
//   
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//        
//        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
//       
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//    }
//}
