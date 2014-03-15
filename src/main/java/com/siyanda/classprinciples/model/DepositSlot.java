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
public final class DepositSlot {
    
    private String id;

    public DepositSlot()
    {
    }

    public DepositSlot(Deposit depo) {
        id=depo.id;
    }
    
     public static class Deposit
     {
         private String id;
         
         public Deposit id(String value)
         {
             id = value;
             return this;
         }
         
         public DepositSlot slot()
         {
             return new DepositSlot(this);
         }
     }
    
    public boolean isMoneyReceived(double amount)
    {
        if(amount <=0)
            return false;
        else 
            return true;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final DepositSlot other = (DepositSlot) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
