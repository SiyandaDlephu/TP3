/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class BalanceInquery {
    private double balance;
    private String accHolder;

    public BalanceInquery() {
    }

    public BalanceInquery(BalanceInqueryInner inner) {
        this.accHolder = inner.accHolder;
        this.balance = inner.balance;
    }

    public static class BalanceInqueryInner
    {
        private double balance;
        private String accHolder;

        public BalanceInqueryInner(String accHolder) {
            this.accHolder = accHolder;
        }
        public BalanceInqueryInner balance(double balance)
        {
            balance = balance;
            return this;
        }
        public BalanceInqueryInner balanceinqueryinner(BalanceInquery inquery)
        {
            this.accHolder = inquery.getAccHolder();
            this.balance = inquery.getBalance();
            return this;
        }
        public BalanceInquery balanceinquery()
        {
            return new BalanceInquery (this);
        }
    }

    public double getBalance() {
        return balance;
    }    

    public String getAccHolder() {
        return accHolder;
    }
    
}
