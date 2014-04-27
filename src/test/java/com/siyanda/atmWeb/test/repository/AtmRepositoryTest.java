/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmWeb.test.repository;

import static com.siyanda.atmWeb.test.repository.AtmCustomerRepositoryTest.ctx;
import com.siyanda.atmweb.app.conf.ConnectionConfig;
import com.siyanda.atmweb.domain.Atm;
import com.siyanda.atmweb.domain.Screen;
import com.siyanda.atmweb.repository.AtmRepository;
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
public class AtmRepositoryTest {
    
    public AtmRepositoryTest() {
    }
    
    public static ApplicationContext ctx;
    
    private Long id;
    private AtmRepository repo;
    
    @Test void createAtm()
    {
        repo = ctx.getBean(AtmRepository.class);
        Atm atm = new Atm
                .AtmInner(true)
                .id(1L)
                .atm();
        
//        Screen screen = new Screen
//                .ScreenMessage()
//                .massage("Message for you")
//                .id(1L)
//                .screen();
        
       repo.save(atm);
       id=atm.getId();
       Assert.assertTrue(true);
              
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
