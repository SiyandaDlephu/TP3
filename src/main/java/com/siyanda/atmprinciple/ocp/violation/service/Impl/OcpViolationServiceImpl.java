/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ocp.violation.service.Impl;

/**
 *
 * @author inathi-zenande
 */
public class OcpViolationServiceImpl {
        
    /**
     *
     * @param accNum
     * @param name
     * @return
     */
   
    public String newAccount(int accNum, String name)
    {
        accNum = 1234;
        name = "siyanda";
        String accHolder = (accNum + name);
        return accHolder;
    }

      public int accNumber(int accountNumber)
    {
        accountNumber = 1234;
        return accountNumber;
    }
    
  
    public boolean balace(double amount)
    {
        amount = 10.00;
        if(amount <=0)
            return false;
        else
            return true;
    }
}
