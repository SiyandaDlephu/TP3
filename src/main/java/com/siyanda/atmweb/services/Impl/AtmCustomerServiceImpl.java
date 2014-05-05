/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.services.Impl;

import com.siyanda.atmweb.domain.AtmCustomer;
import com.siyanda.atmweb.repository.AtmCustomerRepository;
import com.siyanda.atmweb.services.AtmCustomerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class AtmCustomerServiceImpl implements AtmCustomerService{

    @Autowired
    private AtmCustomerRepository atmcustomerRepository;
    
    @Override
    public List<AtmCustomer> getFirstName(String name) {
       List<AtmCustomer> atmcustomers = new ArrayList<>();
       List<AtmCustomer> allAtmCustomer = atmcustomerRepository.findAll();
       
       for(AtmCustomer atmcust : allAtmCustomer)
       {
           if(atmcust.getFirstname() =="Zenande")
           {
               atmcustomers.add(atmcust);
           }
       }
       return atmcustomers;
    }
    
}
