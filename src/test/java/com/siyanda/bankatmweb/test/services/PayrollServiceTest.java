/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.test.services;

import com.siyanda.bankatmweb.test.ConnectionConfigTest;

import com.siyanda.bankatmweb.app.conf.ConnectionConfig;
import com.siyanda.bankatmweb.domain.Payroll;
import com.siyanda.bankatmweb.repository.AtmRepository;
import com.siyanda.bankatmweb.repository.PayrollRepository;
import com.siyanda.bankatmweb.services.PayrollService;
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
public class PayrollServiceTest {
    
    public static ApplicationContext ctx;
    
    private Long id;
    private PayrollService payrollService;
    private PayrollRepository payrollRepository;
    
    public PayrollServiceTest() {
    }
    
    @Test
    public void getSalary()
    {
        payrollService = ctx.getBean(PayrollService.class);
        payrollRepository = ctx.getBean(PayrollRepository.class);
        
        Payroll salary1 = new Payroll
                .PayrollInner("002HR")
                .salary(15000.00)
                .payroll();
        Payroll salary2 = new Payroll
                .PayrollInner("003IT")
                .salary(10000.00)
                .payroll();
        Payroll salary3 = new Payroll
                .PayrollInner("003HR")
                .salary(14000.00)
                .payroll();
        
        payrollRepository.save(salary1);
        payrollRepository.save(salary2);
        payrollRepository.save(salary3);
        
        List<Payroll> payroll = payrollService.getSalary(14000.00);
        Assert.assertEquals(payroll.size(), 3);
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
        payrollRepository = ctx.getBean(PayrollRepository.class);
        payrollRepository.deleteAll();
    }
}
