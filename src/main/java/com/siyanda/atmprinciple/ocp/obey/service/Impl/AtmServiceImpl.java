/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ocp.obey.service.Impl;

import com.siyanda.atmprinciple.ocp.obey.service.AtmInterface;

/**
 *
 * @author inathi-zenande
 */
public class AtmServiceImpl implements AtmInterface {
    
    @Override
    public String newAccount( String name) { 
  
        return "siyanda";
    }

    @Override
    public int accNumber(int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean balace(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
    
}
