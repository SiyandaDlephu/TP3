/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.srp.obey.service.Impl;

import com.siyanda.atmprinciple.ocp.obey.service.AtmInterface;
import com.siyanda.atmprinciple.srp.obey.service.SrpInterface;

/**
 *
 * @author inathi-zenande
 */
public class SrpServiceImpl implements SrpInterface {

    @Override
    public boolean balance(double amount) {

        
        if(amount <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    @Override
    public String transation(int accNum, double amount) {       
        
        String accNumber;
        if(accNum != 1234)
        {
            accNumber = "Incorrect acount number";
        }
        else
        {
            accNumber ="account number accepted";
        }
            return accNumber;
    }

   
    
}
