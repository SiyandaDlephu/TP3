/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.domain.Cheque;
import com.siyanda.bankatmweb.domain.Credit;
import com.siyanda.bankatmweb.repository.AccountRepository;
import com.siyanda.bankatmweb.services.AccountService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class AccountServiceImpl implements AccountService {
    
    @Autowired
    private AccountRepository repo;

    @Override
    public List<Account> getSavingsAccount(String accountType) {
        
         List<Account> savings = new ArrayList<>();
        List<Account> allsavings = repo.findAll();
        
        for(Account account: allsavings)
        {
            if(account.getAccType() == accountType)
            {
                allsavings.add(account);
            }
        }
        return allsavings;
    }

    @Override
    public List<Account> getCreditAccount(String accountType) {
        
        List<Account> credit = new ArrayList<>();
        List<Account> allcredit = repo.findAll();
        
        for(Account account : allcredit)
        {
            if(account.getAccType() == accountType)
            {
                allcredit.add(account);
            }
        }
        return allcredit;
    }

    @Override
    public List<Account> getChequeAccount(String accountType) {
        
        List<Account> cheque = new ArrayList<>();
        List<Account> allcheque = repo.findAll();
        
        for(Account account : allcheque)
        {
            if(account.getAccType() == accountType)
            {
                allcheque.add(account);
            }
        }
        return allcheque;
    }

    @Override
    public List<Account> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getClubByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccountName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
