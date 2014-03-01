/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.srp.violation.service.Impl;

/**
 *
 * @author inathi-zenande
 */
public class SrpViolationServiceImpl {
    
    public String transation(int accNum, double balance)
    {
        accNum = 1234;
        balance = 150.00;
        String acc;
        String bal;
        
        if(accNum == 0)
        {
            acc ="Null pin not allowed";
        }
        else if(accNum != 1234)
        {
            acc ="wrong account number";
        }
        else
        {
            acc ="Account number is accepted";
        }
        
        if(balance <=0)
        {
            bal ="No money in the account";
        }
        else
        {
            bal ="Money available";
        }
        
        return (acc + bal);
    }
    
    public boolean balance(double amount)
    {
        if(amount <=0)
            return false;
        
        return true;
    }
}
