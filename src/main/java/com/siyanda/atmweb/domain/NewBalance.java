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
public class NewBalance implements Serializable{
    
   private Long id;
    private double newBalace;
    
    public NewBalance() {
    }
    
    public NewBalance(NewBalanceInner inner)
    {
        id = inner.id;
        newBalace = inner.newBalace;
    }
    
    public static class NewBalanceInner
    {
        private Long id;
        private double newBalace;

        public NewBalanceInner() {
        }
        public NewBalanceInner id(Long value)
        {
            id = value;
            return this;
        }
        public NewBalanceInner amount(double am)
        {
            newBalace = am;
            return this;
        }
        public NewBalance newbalance()
        {
            return new NewBalance(this);
        }
        
    }

    public Long getId() {
        return id;
    }

    public double getNewBalace() {
        return newBalace;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.newBalace) ^ (Double.doubleToLongBits(this.newBalace) >>> 32));
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
        final NewBalance other = (NewBalance) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.newBalace) != Double.doubleToLongBits(other.newBalace)) {
            return false;
        }
        return true;
    }

  
}
