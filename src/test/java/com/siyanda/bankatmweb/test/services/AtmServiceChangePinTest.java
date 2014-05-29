/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Atm;
import com.siyanda.bankatmweb.repository.AtmRepository;
import com.siyanda.bankatmweb.services.AtmService;
import static com.siyanda.bankatmweb.test.services.AtmServiceTest.ctx;
import java.util.List;
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
public class AtmServiceChangePinTest {
    
     public static ApplicationContext ctx;
    
    private Long id;
    private AtmRepository atmRepository;
    private AtmService atmservice;
    
  
    public AtmServiceChangePinTest() {
    }
    
    @Test
    public void changingPIN()
    {
        atmservice = ctx.getBean(AtmService.class);
        atmRepository = ctx.getBean(AtmRepository.class);
        
        Atm atm1 = new Atm
                .AtmInner("rosebank")
                .changePin("303030")
                .atm();
        Atm atm2 = new Atm
                .AtmInner("rosebank")
                .changePin("112233")
                .atm();
        Atm atm3 = new Atm
                .AtmInner("rosebank")
                .changePin("332211")
                .atm();
        
        atmRepository.save(atm1);
       atmRepository.save(atm2);
       atmRepository.save(atm3);
       
       List<Atm> pin = atmservice.getChangePin("303030");
       Assert.assertEquals(pin.size(), 3);
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
        atmRepository = ctx.getBean(AtmRepository.class);
        atmRepository.deleteAll();
    }
}
