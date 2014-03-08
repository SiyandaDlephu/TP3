/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.model;

/**
 *
 * @author inathi-zenande
 */
public final class NewBalance {
    
    private String id;
    private  double newBalance = 200.00;

       
    public NewBalance(NewAmount newAmount)
    {
        id=newAmount.id;
        newBalance=newAmount.newBal;
    }
    
    public static class NewAmount
    {
        private String id;
        private double newBal;
        
        public NewAmount id(String value)
        {
            id = value;
            return this;
        }
        
        public NewAmount newBal(double amount)
        {
            newBal = amount;
            return this;
        }

        public NewBalance balance()
        {
            return new NewBalance(this);
        }
               
    }

    public String getId() {
        return id;
    }

    public double getNewBalance() {
        return newBalance;
    }
 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.newBalance) ^ (Double.doubleToLongBits(this.newBalance) >>> 32));
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
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (Double.doubleToLongBits(this.newBalance) != Double.doubleToLongBits(other.newBalance)) {
            return false;
        }
        return true;
    }
    
    

    
    
}
