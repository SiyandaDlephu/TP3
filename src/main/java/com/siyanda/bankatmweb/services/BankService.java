/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services;

import com.siyanda.bankatmweb.domain.Bank;
import java.util.List;

/**
 *
 * @author inathi-zenande
 */
public interface BankService {
    
    public List<Bank> getBankName(String bankName);

    public void persist(BankService bank);

    public void merge(BankService bank);

    public BankService find(Long id);

    public List<Bank> findAll();
}
