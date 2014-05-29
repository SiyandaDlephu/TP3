/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.AtmCustomer;
import com.siyanda.bankatmweb.repository.AtmCustomerRepository;
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
public class AtmCustomerRepositoryTest {
    public static ApplicationContext ctx;
    
    private Long id;
    private AtmCustomerRepository repo;
    
    public AtmCustomerRepositoryTest() {
    }

   @Test
   public void createAtmCustomer()
   {
       repo = ctx.getBean(AtmCustomerRepository.class);
       
       AtmCustomer atmcust = new AtmCustomer
               .AtmCustomerInner("1234566")
               .custAccountNumber("12233344455555666666")
               .atmcustomer();
     
       repo.save(atmcust);
       id = atmcust.getId();
       Assert.assertNotNull(atmcust);
   }
   
   @Test(dependsOnMethods="createAtmCustomer")
   public void readAtmCustomer()
   {
       repo = ctx.getBean(AtmCustomerRepository.class);
       AtmCustomer atmcust = repo.findOne(id);
       Assert.assertEquals(atmcust.getCustPinNumber(), "1234566");
   }
    
   @Test(dependsOnMethods="readAtmCustomer")
   public void updateAtmCustomer()
   {
       repo = ctx.getBean(AtmCustomerRepository.class);
       AtmCustomer atmcust = repo.findOne(id);
       AtmCustomer updateAtmcust = new AtmCustomer
               .AtmCustomerInner("6654321")
               .custAccountNumber("666666555554444333221")
               .atmcustomer();
       
       repo.save(updateAtmcust);
       
       AtmCustomer newAtmcust = repo.findOne(id);
       Assert.assertEquals(newAtmcust.getCustPinNumber(), "1234566");
   }
   @Test(dependsOnMethods="updateAtmCustomer")
   public void deleteAtmCustomer()
   {
       repo = ctx.getBean(AtmCustomerRepository.class);
       AtmCustomer atmcust = repo.findOne(id);
       repo.delete(atmcust);
       
       AtmCustomer deletedAtmcust = repo.findOne(id);
       Assert.assertNull(deletedAtmcust);
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
