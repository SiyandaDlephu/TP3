/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Payroll;
import com.siyanda.bankatmweb.repository.PayrollRepository;
import com.siyanda.bankatmweb.services.PayrollService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class PayrollRepositoryServiceTest implements PayrollService{

    @Autowired
    private PayrollRepository payrollRepository;
    
    @Override
    public List<Payroll> getSalary(double salary) {
        
        List<Payroll> roll = new ArrayList<>();
        List<Payroll> allRoll = payrollRepository.findAll();
        
        for(Payroll payroll : allRoll)
        {
            if(payroll.getSalary() >salary)
            {
                allRoll.add(payroll);
            }
        }
        return allRoll;
    }
    
}
