/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmprinciple.srp.obey.service;

/**
 *
 * @author inathi-zenande
 */
public interface SrpInterface {
    
    public boolean balance(double amount);
    public String transation(int accNum, double amount);
}
