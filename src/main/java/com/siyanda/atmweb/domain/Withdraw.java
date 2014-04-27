/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Withdraw implements Serializable{
    
    private Long id;
    private double amount;

    @Embedded
    private NewBalance newbalance;
    
    public Withdraw() {
    }
    
    public Withdraw(WithdrawInner inner)
    {
        id = inner.id;
        amount = inner.amount;
    }
    
    public static class WithdrawInner
    {
        private Long id;
        private double amount;

        public WithdrawInner() {
        }
        public WithdrawInner id(Long value)
        {
            id = value;
            return this;
        }
        public WithdrawInner amount(double am)
        {
            amount = am;
            return this;
        }
        public Withdraw withdraw()
        {
            return new Withdraw(this);
        }
        
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Withdraw other = (Withdraw) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.atmweb.domain.Withdraw[ id=" + id + " ]";
    }
    
    
}
