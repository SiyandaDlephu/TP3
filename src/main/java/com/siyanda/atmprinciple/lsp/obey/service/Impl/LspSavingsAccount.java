/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.lsp.obey.service.Impl;

import com.siyanda.atmprinciple.lsp.obey.service.LspInterface;

/**
 *
 * @author inathi-zenande
 */
public class LspSavingsAccount implements LspInterface{

    @Override
    public String accountType(String accType) {
        String thisType;
        if(!accType .equalsIgnoreCase("savings"))
            thisType ="Wrong account type";
        else
            thisType ="savings account";
        
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
