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
//import com.siyanda.atmweb.domain.Atm;
//import com.siyanda.atmweb.domain.Screen;
//import com.siyanda.atmweb.repository.AtmRepository;
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
//public class AtmRepositoryTest {
//    public static ApplicationContext ctx;
//    
//    private Long id;
//    private AtmRepository AtmRepository;
//    
//    public AtmRepositoryTest() {
//    }
//        
//    @Test 
//     public void createAtm()
//    {
//        AtmRepository = ctx.getBean(AtmRepository.class);
//        Atm atm = new Atm
//                .AtmInner("101010")
//                .userAuthorized(true)
//                .atm();
//        
////        Screen screen = new Screen
////                .ScreenMessage()
////                .massage("Message for you")
////                .id(1L)
////                .screen();
//        
//       AtmRepository.save(atm);
//       id=atm.getId();
//       Assert.assertTrue(true);
//              
//    }
//     
//    @Test(dependsOnMethods="createAtm")
//    public void readAtm()
//    {
//        AtmRepository = ctx.getBean(AtmRepository.class);
//        Atm atm = AtmRepository.findOne(id);
//        Assert.assertEquals(atm.isUserAuthorized(), true);
//        
//    }
//    
//    @Test(dependsOnMethods="readAtm")
//    public void updateAtm()
//    {
//        AtmRepository = ctx.getBean(AtmRepository.class);
//        Atm atm = AtmRepository.findOne(id);
//        Atm updateAtm = new Atm
//                .AtmInner("1234")
//                .atm(atm)
//                .userAuthorized(false)
//                .atm();
//        
//        AtmRepository.save(updateAtm);
//        
//        Atm newAtm = AtmRepository.findOne(id);
//        Assert.assertEquals(newAtm.isUserAuthorized(), false);
//        
//    }
//    
//    @Test(dependsOnMethods="updateAtm")
//    public void deleteAtm()
//    {
//        AtmRepository = ctx.getBean(AtmRepository.class);
//        Atm atm = AtmRepository.findOne(id);
//        AtmRepository.delete(atm);
//        
//        Atm deletedAtm = AtmRepository.findOne(id);
//        Assert.assertNull(deletedAtm);
//    }
//    
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
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
