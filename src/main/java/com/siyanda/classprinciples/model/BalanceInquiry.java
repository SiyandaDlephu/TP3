/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.model;

import com.siyanda.classprinciples.model.EWalllet.Wallet;

/**
 *
 * @author inathi-zenande
 */
public final class BalanceInquiry implements Transaction{

     private String id;
     private double amount;

    public BalanceInquiry()
    {
    }

    public BalanceInquiry(BalanceInq bal)
    {
        id=bal.id;
    }

    @Override
    public double excecute(double amo)
    {
        final double total=520.00;
        double newTotal =  total - amo;
        
        return newTotal;
    }
     
    public static class BalanceInq
    {
        private String id;
        
        public BalanceInq(String value)
        {
            this.id =value;
        }
       
              
        public BalanceInq id(String value)
        {
            id = value;
            return this;
        }
       
        public BalanceInquiry bala()
        {
            return  new BalanceInquiry (this);
        }

        private BalanceInquiry BalanceInquiry(BalanceInq aThis) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    

    public String getId() {
        return id;
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
        final BalanceInquiry other = (BalanceInquiry) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
        
    
}
