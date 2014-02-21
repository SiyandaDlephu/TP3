/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Siyanda.service.Impl;

import Siyanda.service.SiyandaService;

/**
 *
 * @author student
 */
public class SiyandaServiceImpl implements SiyandaService {
    @Override
    public String assertMessage(String message) {
        return message;  
    }
    @Override
    public double balance(double newBalance) {
        newBalance = 10.25;
        return newBalance;
    }
    @Override
    public int accountNumber(int accNum) {
        accNum =123;
        return accNum;
    }
    @Override
    public String objectEquals(String first, String second) {
        first = "inathi";
        second ="inathi";
        String conc =(first + second);
        return conc;
    }
    @Override
    public String objectIdentity(String first) {
        first = "zenenda";
        
        return first;
    }
    @Override
    public boolean truthWithdraw(double bal) {
        if(bal >10)
            return true;
        else
        return false;
        
    }
    @Override
    public boolean falsityNoMoney() {
        return false;
    }
    @Override
    public boolean nullPin() {
        
            return  true;
    }
    @Override
    public int notNullPin(int pin) {
        pin = 1010;
        return pin;
    }
    @Override
    public boolean failPin(String pin) {
       pin = "123";
       return true;
    }
    @Override
    public int exceptionWrongPin(int pin) {
        pin = 123;
        return pin;
    }

    public String timeout(String message) {
        return("timeout");
    }
    
    
 
  
}
