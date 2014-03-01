/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ispp.obey.service.Impl;

import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceBal;

/**
 *
 * @author inathi-zenande
 */
public class ClientInfo implements IspInterfaceBal{

    @Override
    public String accountType() {
        String thisType = "savings";
      
        
        return thisType;
    }

    @Override
    public boolean balance(double amount) {
        if(amount <= 0)
            return false;
        else
            return true;
       
    }
    
}
