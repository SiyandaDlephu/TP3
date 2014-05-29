/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services.impl;

import com.siyanda.bankatmweb.domain.Ewallet;
import com.siyanda.bankatmweb.repository.EwalletRepository;
import com.siyanda.bankatmweb.services.EwalletService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author inathi-zenande
 */
@Service
public class EwalletServiceImpl implements EwalletService{
    @Autowired
    private EwalletRepository ewalletRepository;
    
    @Override
    public List<Ewallet> withdraw(double amount) {
       
        List<Ewallet> ewallet = new ArrayList<>();
        List<Ewallet> withdrawal = ewalletRepository.findAll();
        
        for(Ewallet wallet : withdrawal)
        {
            if(wallet.getWithdraw() == amount)
            {
                withdrawal.add(wallet);
            }
        }
        return withdrawal;
    }
    
    
    
}
