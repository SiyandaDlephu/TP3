/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Cheque implements Serializable{
    
    private double money;
    private String datee;
    private double interestRate;

    public Cheque(ChequeInner inner)
    {
        this.money = inner.money;
        this.datee = inner.datee;
        this.interestRate = inner.interestRate;
        
    }
    
     public Cheque() {
    }
    
    public static class ChequeInner
    {
        private double money;
        private String datee;
         private double interestRate;

        public ChequeInner(String datee) {
            this.datee=datee;
            
        }
        public ChequeInner money(double am)
        {
            money = am;
            return this;
        }
        public ChequeInner interestRate(double rate)
        {
            interestRate = rate;
            return this;
        }
        
        public ChequeInner chequeinner(Cheque che)
        {
            this.money=che.getMoney();
            this.datee=che.getDatee();
            this.interestRate =che.getInterestRate();
            return this;
        }
        public Cheque check()
        {
            return new Cheque(this);
        }
    }
    
        public double getMoney() {
            return money;
        }

    public String getDatee() {
        return datee;
    }

    public double getInterestRate() {
        return interestRate;
    }
        
        
}

