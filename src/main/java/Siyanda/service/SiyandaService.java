/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Siyanda.service;

/**
 *
 * @author student
 */
public interface SiyandaService 
{
    public String assertMessage(String message);
    public double balance(double newBalance);
    public int accountNumber(int accNum);
    public String objectEquals(String first, String second);
    public String objectIdentity(String first);
    public boolean truthWithdraw(double bal);
    public boolean falsityNoMoney();
    public boolean nullPin();
    public int notNullPin(int pin);
    public boolean failPin(String pin);
    public int exceptionWrongPin(int pin);
    public String timeout(String message);
}
