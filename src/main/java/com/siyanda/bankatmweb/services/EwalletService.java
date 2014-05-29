/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.services;

import com.siyanda.bankatmweb.domain.Ewallet;
import java.util.List;

/**
 *
 * @author inathi-zenande
 */
public interface EwalletService {
    
    public List<Ewallet> withdraw(double amount);
}
