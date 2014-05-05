///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmWeb.test.services;
//
//import com.siyanda.atmweb.app.conf.ConnectionConfig;
//import com.siyanda.atmweb.domain.Account;
//import com.siyanda.atmweb.repository.AccountRepository;
//import com.siyanda.atmweb.services.AccountSavingsService;
//import java.util.List;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//public class AccountSavingsServiceTest {
//    
//    private static ApplicationContext ctx;
//    private AccountSavingsService accountsavingsservice;
//    private AccountRepository accountrepository;
//    
//    public AccountSavingsServiceTest() {
//    }
//
//    @Test
//    public void getSavingsAccount()
//    {
//        accountrepository = ctx.getBean(AccountRepository.class);
//        accountsavingsservice = ctx.getBean(AccountSavingsService.class);
//        
//        Account act1 = new Account.AccountInner("1234")
//                .accType("Savings")
//                .account();
//        Account act2 = new Account.AccountInner("4321")
//                .accType("Chekc")
//                .account();
//        Account act3 = new Account.AccountInner("6789")
//                .accType("Savings")
//                .account();
//        
//        accountrepository.save(act1);
//        accountrepository.save(act2);
//        accountrepository.save(act3);
//        
//        List<Account> account = accountsavingsservice.getSavingsAccount("Savings");
//    }
// 
//    @BeforeClass
//    public static void setUpClass() throws Exception {
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
//        accountrepository = ctx.getBean(AccountRepository.class);
//       accountrepository.deleteAll();
//    }
//}
