/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.ocp.obey.service;

/**
 *
 * @author inathi-zenande
 */
public interface AtmInterface {
    
    public String newAccount( String name);
    //public String holder(String name);
    public int accNumber(int accountNumber);
    public boolean balace(double amount);
    /*public String transation(int accNum, double amount);
       
    public boolean wrongPin(int accNUm, String password);
    public String nullPinOrAccNum(int accNUm, String password);
    public boolean nullPin(String password);
    public String withDrawNewBal(int accNUm, double amount);*/
    
}
