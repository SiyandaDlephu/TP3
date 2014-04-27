/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Credit implements Serializable{
    
     private Long id;
    private double amount;
    
    public Credit() {
    }
    
    public Credit(CreditInner inner)
    {
        id = inner.id;
        amount = inner.amount;
    }
    
    public static class CreditInner
    {
        private Long id;
        private double amount;

        public CreditInner() {
        }
        public CreditInner id(Long value)
        {
            id = value;
            return this;
        }
        public CreditInner amount(double am)
        {
            amount = am;
            return this;
        }
        public Credit credit()
        {
            return new Credit(this);
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
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final Credit other = (Credit) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
}
