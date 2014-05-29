/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Bank;
import com.siyanda.bankatmweb.repository.BankRepository;
import com.siyanda.bankatmweb.services.BankService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepository bankRepository;
    
    @Override
    public List<Bank> getBankName(String bankName) {
       
        List<Bank> banks = new ArrayList<>();
        List<Bank> allbanks = bankRepository.findAll();
        
        for(Bank bank : allbanks)
        {
            if(bank.getBankName() .equals(bankName))
            {
                allbanks.add(bank);
            }
        }
        return allbanks;
    }    

    @Override
    public void persist(BankService bank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(BankService bank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BankService find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bank> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
