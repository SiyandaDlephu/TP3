/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Atm;
import com.siyanda.bankatmweb.repository.AtmRepository;
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
    
    public static ApplicationContext ctx;
    
    private Long id;
    private AtmRepository repo;
    
    public AtmRepositoryTest() {
    }

    @Test
    public void createAtm()
    {
        repo = ctx.getBean(AtmRepository.class);
        
        Atm atm = new Atm
                .AtmInner("blowburg")
                .changePin("101010")
                .screen("Welcome to fnb")
                .atm();
        
        repo.save(atm);
        id = atm.getId();
        Assert.assertNotNull(atm);
    }
    
    @Test(dependsOnMethods="createAtm")
    public void readAtm()
    {
        repo = ctx.getBean(AtmRepository.class);
        Atm atm = repo.findOne(id);
        Assert.assertEquals(atm.getAtmLocation(), "blowburg");
    }
    
    @Test(dependsOnMethods="readAtm")
    public void updateAtm()
    {
        repo = ctx.getBean(AtmRepository.class);
        Atm atm = repo.findOne(id);
        Atm updateAtm = new Atm
                .AtmInner("woodstock")
                .changePin("202020")
                .screen("You not welcome")
                .atm();
        
        repo.save(updateAtm);
        
        Atm newAtm = repo.findOne(id);
        Assert.assertEquals(newAtm.getAtmLocation(), "blowburg");
    }
    
    @Test(dependsOnMethods="updateAtm")
    public void deleteAtm()
    {
        repo = ctx.getBean(AtmRepository.class);
        Atm atm = repo.findOne(id);
        repo.delete(atm);
        
        Atm deletedAtm = repo.findOne(id);
        Assert.assertNull(deletedAtm);
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
