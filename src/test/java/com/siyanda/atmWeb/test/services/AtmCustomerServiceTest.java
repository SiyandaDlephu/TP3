/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmWeb.test.services;

import com.siyanda.atmweb.app.conf.ConnectionConfig;
import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.repository.AtmCustomerRepository;
import com.siyanda.atmweb.services.AtmCustomerService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class AtmCustomerServiceTest {
    
    private static ApplicationContext ctx;
    private AtmCustomerService atmcustomerservice;
    private AtmCustomerRepository atmcustomerrepository;
    
    public AtmCustomerServiceTest() {
    }
    
    @Test
    public void getAtmCustomer()
    {
        atmcustomerrepository = ctx.getBean(AtmCustomerRepository.class);
        atmcustomerservice = ctx.getBean(AtmCustomerService.class);
        
        AtmCustomer atmcust1 = new AtmCustomer.Customer("1234")
                .firstname("Zenande")
                .atmcust();
        AtmCustomer atmcust2 = new AtmCustomer.Customer("5555")
                .firstname("Zenande")
                .atmcust();
        AtmCustomer atmcust3 = new AtmCustomer.Customer("1010")
                .firstname("Lamar")
                .atmcust();
        
        atmcustomerrepository.save(atmcust1);
        atmcustomerrepository.save(atmcust2);
        atmcustomerrepository.save(atmcust3);
        
        List<AtmCustomer> atmcustomer = atmcustomerservice.getFirstName("Zenande");
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
        atmcustomerrepository = ctx.getBean(AtmCustomerRepository.class);
       atmcustomerrepository.deleteAll();
    }
}
