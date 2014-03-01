/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ispp.violation.service.Impl;

import com.siyanda.atmprinciple.ispp.violation.service.IsppServiceVIoletion;

/**
 *
 * @author inathi-zenande
 */
public abstract class IsppVioletionPin implements IsppServiceVIoletion{

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
    
    
}
