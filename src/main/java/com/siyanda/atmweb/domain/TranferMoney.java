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
public class TranferMoney implements Serializable{
 
      private Long id;
    private double amount;

    public TranferMoney() {
    }
    
    public TranferMoney(TranferMoneyInner inner)
    {
        id = inner.id;
        amount = inner.amount;
    }
    
    public static class TranferMoneyInner
    {
         private Long id;
         private double amount;

        public TranferMoneyInner() {
        }
        public TranferMoneyInner id(Long value)
        {
            id = value;
            return this;
        }
        public TranferMoneyInner amount(double amo)
        {
            amount = amo;
            return this;
        }
        public TranferMoney tranfermoney()
        {
            return new TranferMoney(this);
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
        int hash = 3;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final TranferMoney other = (TranferMoney) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
}
