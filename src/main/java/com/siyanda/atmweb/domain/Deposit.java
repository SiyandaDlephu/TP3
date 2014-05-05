/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Deposit implements Serializable{
    
    private Long id;
    private double amount;
    
    @OneToOne
    @JoinColumn(name="deposit_id")
    List<DepositSlip> depositslip;

    public Deposit() {
    }
    
    public Deposit(DepositInner inner)
    {
        id = inner.id;
        amount = inner.amount;
    }
    
    public static class DepositInner
    {
         private Long id;
         private double amount;

        public DepositInner() {
        }
        public DepositInner id(Long value)
        {
            id = value;
            return this;
        }
        public DepositInner amount(double amo)
        {
            amount = amo;
            return this;
        }
        public Deposit deposit()
        {
            return new Deposit(this);
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
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final Deposit other = (Deposit) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
    
}
