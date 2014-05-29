/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.repository;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Payroll;
import com.siyanda.bankatmweb.repository.PayrollRepository;
import static com.siyanda.bankatmweb.test.repository.AccountRepositoryTest.ctx;
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
public class PayrollRepositoryTest {
    
     public static ApplicationContext ctx;
    
    private Long id;
    private PayrollRepository repo;
    
    public PayrollRepositoryTest() {
    }

    @Test
    public void createPayroll()
    {
         repo = ctx.getBean(PayrollRepository.class);
         Payroll pay = new Payroll
                 .PayrollInner("111HR")
                 .salary(15000.00)
                 .hours(8)
                 .tax(0.05)
                 .payroll();
         
         repo.save(pay);
         id = pay.getId();
         Assert.assertNotNull(pay);
    }
    @Test(dependsOnMethods="createPayroll")
    public void readPayroll()
    {
        repo = ctx.getBean(PayrollRepository.class);
        Payroll pay = repo.findOne(id);
        Assert.assertEquals(pay.getPayrollId(),"111HR");
    }
    @Test(dependsOnMethods="readPayroll")
    public void updatePayroll()
    {
        repo = ctx.getBean(PayrollRepository.class);
        Payroll pay = repo.findOne(id);
        Payroll updatePayroll = new Payroll
                .PayrollInner("222IT")
                .payrollinner(pay)
                .salary(20000.00)
                .hours(8)
                .tax(0.07)
                .payroll();
        
        repo.save(updatePayroll);
        
        Payroll newPayroll = repo.findOne(id);
        Assert.assertEquals(newPayroll.getPayrollId(), "111HR");
        
    }
    @Test(dependsOnMethods="updatePayroll")
    public void deletePayroll()
    {
        repo = ctx.getBean(PayrollRepository.class);
        Payroll pay = repo.findOne(id);
        repo.delete(pay);
                
        Payroll deletedPayroll = repo.findOne(id);
        Assert.assertNull(deletedPayroll);
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
