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
public class ChequeAccount implements LspInterface{

    @Override
    public String accountType(String accType) {
        
        String thisType;
        if(!accType .equalsIgnoreCase("cheque"))
            thisType ="Wrong account type";
        else
            thisType ="Checkking account";
        
        return thisType;
    }

    @Override
    public boolean balance(double amount) {
        
        if(amount <= 100)
            return false;
        else
            return true;
    }
    
}
