/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services;

import com.siyanda.bankatmweb.domain.Account;
import com.siyanda.bankatmweb.domain.Cheque;
import com.siyanda.bankatmweb.domain.Credit;
import java.util.List;

/**
 *
 * @author inathi-zenande
 */
public interface AccountService {
    
     public List<Account> getSavingsAccount(String accountType);
     public List<Account> getCreditAccount(String accountType);
      public List<Account> getChequeAccount(String accountType);

    public List<Account> findAll();

    public Account getClubByName(String name);

    public void persist(Account account);

    public void merge(Account account);

    public Account find(Long id);

    public Account getAccountName(String name);
}
