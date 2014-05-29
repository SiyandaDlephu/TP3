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
public class Savings implements Serializable{

    private double amount;
    private String date;
    private double intresteRate;
   
    
    public Savings(SavingsInner inner)
    {
        amount = inner.amount;
        date = inner.date;
        intresteRate = inner.intresteRate;
    }
     public Savings() {
    }
    
    public static class SavingsInner
    {
        private double amount;
         private String date;
         private double intresteRate;

        public SavingsInner(String date) {
            this.date=date;
        }
        
        public SavingsInner amount(double am)
        {
            amount = am;
            return this;
        }
        public SavingsInner intresteRate(double rate)
        {
            intresteRate = rate;
            return this;
        }
        
        public SavingsInner savingsinner(Savings save)
        {
            this.amount=save.getAmount();
            this.date=save.getDate();
            this.intresteRate =save.getIntresteRate();
            return this;
        }
        
        public Savings savings()
        {
            return new Savings(this);
        }
        
    }


    public double getAmount() {
        return amount;
    }

    public double getIntresteRate() {
        return intresteRate;
    }

    public String getDate() {
        return date;
    }

    
}
