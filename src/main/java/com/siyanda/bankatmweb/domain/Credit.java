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
public class Credit implements Serializable{
    private double amount2;
    private String date2;
    private double interestRate2;
    
   
    
    public Credit(CreditInner inner)
    {
        this.amount2 = inner.amount2;
        this.date2 = inner.date2;
        this.interestRate2 = inner.interestRate2;
    }
    
     public Credit() {
    }
    
    public static class CreditInner
    {
        private double amount2;
        private String date2;
          private double interestRate2 ;

        public CreditInner(String date2) {
            this.date2=date2;
        }
        public CreditInner amount2(double am)
        {
            amount2 = am;
            return this;
        }
//        public CreditInner date2(String date)
//        {
//            date2 = date;
//            return this;
//        }
        public CreditInner interestRate2(double rate)
        {
            interestRate2 = rate;
            return this;
        }
        public CreditInner creditinner(Credit credit)
        {
            amount2 = credit.getAmount2();
            date2 = credit.getDate2();
            interestRate2 = credit.getInterestRate();
            return this;
        }
        public Credit credit()
        {
            return new Credit(this);
        }
        
    }

    public double getAmount2() {
        return amount2;
    }

    public String getDate2() {
        return date2;
    }

    public double getInterestRate() {
        return interestRate2;
    }

    
}

