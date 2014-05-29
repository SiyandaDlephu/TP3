/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.repository.AccountRepository;
import com.siyanda.bankatmweb.services.TotalAccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */

@Service
public class TotalAccountServiceImpl implements TotalAccountService{
    
    @Autowired
    private AccountRepository accountRepository;
   
    @Override
    public List<Account> getTotalAccount() {
        return accountRepository.findAll();
    }
}