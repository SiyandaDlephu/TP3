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
public interface TotalBankService {
    
    public List<Bank> getTotalBankName();
}
