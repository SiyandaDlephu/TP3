/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Bank;
import com.siyanda.bankatmweb.repository.BankRepository;
import com.siyanda.bankatmweb.services.TotalBankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class TotalBankServiceImpl implements TotalBankService{

    @Autowired
    private BankRepository bankRepository;
    
    @Override
    public List<Bank> getTotalBankName() {
       return bankRepository.findAll();
    }  
}
