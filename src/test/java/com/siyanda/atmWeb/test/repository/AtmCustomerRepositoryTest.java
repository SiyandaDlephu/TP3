/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmWeb.test.repository;

import com.siyanda.atmweb.app.conf.ConnectionConfig;
import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.domain.CardExpired;
import com.siyanda.atmweb.domain.CardValidation;
import com.siyanda.atmweb.domain.ChangePin;
import com.siyanda.atmweb.repository.AtmCustomerRepository;
import static org.apache.derby.impl.sql.compile.SQLParserConstants.T;
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
public class AtmCustomerRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;

    private AtmCustomerRepository repo;
    
    
    public AtmCustomerRepositoryTest() {
    }

       @Test
     public void createAtmCustomer() {
         repo = ctx.getBean(AtmCustomerRepository.class);
         AtmCustomer atmcustomer = new AtmCustomer
                 .Customer("Siyanda")
                 //.id(1)
                 .pinNUmber("1234")
                 .atmcust();
         
//         ChangePin c = new ChangePin
//                .ChangingPin("1234")
//                 .newPIn("4321")
//                 .id(1L)
//                 .changepin();
//         
//         CardExpired cx = new CardExpired
//                 .CheckCard()
//                 .dataExp("15-sep-2015")
//                 .id(1L)
//                 .expired();
//         
//        CardValidation cv = new CardValidation
//                .CardValidate()
//                .check("yes")
//                .id(1L)
//                .cardvalidation();
                
//         atmcustomer.setId(id);
         
         repo.save(atmcustomer);
         id = atmcustomer.getId();
         Assert.assertNotNull(atmcustomer);
     
     }
    
      @Test(dependsOnMethods = "createAtmCustomer")
     public void readPerson(){
         repo = ctx.getBean(AtmCustomerRepository.class);
         AtmCustomer atmcust = repo.findOne(id);
         Assert.assertEquals(atmcust.getFirstname(), "Siyanda");
         
     }
//     
//      @Test(dependsOnMethods = "readAtmCustomer")
//     private void updateAtmCustomer(){
//         repo = ctx.getBean(AtmCustomerRepository.class);
//         AtmCustomer atmcus = repo.findOne(id);
//         AtmCustomer updatedAtmCustomer = new AtmCustomer.Customer("SiyandaDLephu")
//                 .atmcust(atmcus)
//                 .firstname("Siyanda")
//                 .build();
//        
//         repo.save(updatedAtmCustomer);
//         
//         AtmCustomer newAtmCustomer = repo.findOne(id);
//         Assert.assertEquals(newAtmCustomer.getFirstname(), "Dlephu");
//         
//     }
     
     @Test(dependsOnMethods = "updateAtmCustomer")
     private void deleteAtmCustomer(){
         repo = ctx.getBean(AtmCustomerRepository.class);
         AtmCustomer atmcust = repo.findOne(id);
         repo.delete(atmcust);
         
         AtmCustomer deletedAtmCustomer = repo.findOne(id);
         
         Assert.assertNull(deletedAtmCustomer);

     }
     
    @BeforeClass
    public void setUpClass() throws Exception {
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
