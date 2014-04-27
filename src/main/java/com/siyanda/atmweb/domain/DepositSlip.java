/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class DepositSlip implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double newAmount;

    public DepositSlip() {
    }
    
    public DepositSlip(DepositSlipInner inner)
    {
        id = inner.id;
        newAmount =inner.newAmount;
    }
    
    public static class DepositSlipInner
    {
        private Long id;
        private double newAmount;

        public DepositSlipInner() {
        }
        public DepositSlipInner id(Long value)
        {
            id = value;
            return this;
        }
        public DepositSlipInner newAmount(double amo)
        {
            newAmount = amo;
            return this;
        }
        public DepositSlip depositslip()
        {
            return new DepositSlip(this);
        }
        
    }

    public Long getId() {
        return id;
    }

    public double getNewAmount() {
        return newAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.newAmount) ^ (Double.doubleToLongBits(this.newAmount) >>> 32));
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
        final DepositSlip other = (DepositSlip) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Double.doubleToLongBits(this.newAmount) != Double.doubleToLongBits(other.newAmount)) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "DepositSlip{" + "id=" + id + ", newAmount=" + newAmount + '}';
//    }
    @Override
    public String toString() {
        return "com.siyanda.atmweb.domain.DepositSlip[ id=" + id + " ]";
    }
    
    
}
