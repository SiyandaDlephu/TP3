/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.dip.violation.service.Impl;

import com.siyanda.atmprinciple.dip.obey.service.Impl.DipServiceImpl;

/**
 *
 * @author inathi-zenande
 */
public class DIpVIolationImpl  extends DipServiceImpl{
    
    @Override
    public int withDrawNewBal(int accNUm) {
               
        accNUm = 1234;
        double amount;
        String name = "Siyanda";
        double balance =1000.00;
        amount = 500;        
        double newbalance = balance - amount;
        int state =0;
        
        while(accNUm !=1234 || accNUm!=1111 || accNUm!=2222)
        {
            if(balance <= 0)
            {
                state = 0;
            }
            else
            {
                state = 100;
            }
            System.out.print("Wrong account number");
        }
        return state;
    }
}
