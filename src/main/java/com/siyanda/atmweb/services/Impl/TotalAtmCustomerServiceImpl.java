/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.services.Impl;

import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.repository.AtmCustomerRepository;
import com.siyanda.atmweb.services.TotalAtmCustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class TotalAtmCustomerServiceImpl implements TotalAtmCustomerService{

    @Autowired
    private AtmCustomerRepository atmcustomerRepository;
    
    @Override
    public List<AtmCustomer> getTotalAtmCustomer() {
       return atmcustomerRepository.findAll();
    }
    
}
