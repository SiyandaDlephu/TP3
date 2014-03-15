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
public final class CashDispanser {
    
    private String id;
    private final static int INITIAL_COUNT =500;
    private double count;
    
    

    public CashDispanser()
    {
        count = INITIAL_COUNT;
    }

    public CashDispanser(Dispanser dis) 
    {
        id=dis.id;
    }
    
    public static class Dispanser
    {
        private String id;
        private final static int INITIAL_COUNT =500;
        private double count;
        
        public Dispanser (double a)
        {
            this.count=a;
        }
        public Dispanser id(String value)
        {
            id = value;
            return this;
        }
        
        public CashDispanser cash()
        {
            return new CashDispanser(this);
        }
    }
    
    public void dispnanserCash(double amount)
    {
        double required = amount /20;
        count = required;
    }
    
    public boolean isSufficientCash(double amount)
    {
        double required = amount/20;
        if(count>=required)
            return true;
        else
            return false;
    }

    public String getId() {
        return id;
    }

    public static int getINITIAL_COUNT() {
        return INITIAL_COUNT;
    }

    public double getCount() {
        return count;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.count) ^ (Double.doubleToLongBits(this.count) >>> 32));
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
        final CashDispanser other = (CashDispanser) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (Double.doubleToLongBits(this.count) != Double.doubleToLongBits(other.count)) {
            return false;
        }
        return true;
    }
    
    
}
