/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.lsp.violation.service.Impl;

import com.siyanda.atmprinciple.lsp.violation.service.LspInterfaceViolation;

/**
 *
 * @author inathi-zenande
 */
public class LspViolationAcc implements LspInterfaceViolation{

    @Override
    public String pinNumber(int pin) {
       pin =1234;
        String correct;
        
        if(pin == 1234)
        correct ="correct pin";
        else
            correct ="incorrect pin";
        
        return correct;
    }

    @Override
    public boolean balance(double amount) {
        if(amount <= 0)
            return false;
        else
            return true;
    }
    
}
