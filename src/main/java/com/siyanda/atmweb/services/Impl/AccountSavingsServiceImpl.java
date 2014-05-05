///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmweb.services.Impl;
//
//import com.siyanda.atmweb.domain.Account;
//import com.siyanda.atmweb.repository.AccountRepository;
//import com.siyanda.atmweb.services.AccountSavingsService;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author inathi-zenande
// */
//@Service
//public class AccountSavingsServiceImpl implements AccountSavingsService{
//
//    @Autowired
//    private AccountRepository accountRepository;
//    
//    @Override
//    public List<Account> getSavingsAccount(String accountype) 
//    {
//       List<Account> accounts = new ArrayList<>();
//       List<Account> allAccounts = accountRepository.findAll();
//       
//       for(Account account : allAccounts)
//       {
//           if(account.getAccType() =="Savings")
//           {
//               accounts.add(account);
//           }
//       }
//       return accounts;
//    }
//    
//}
