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
public final class WithdrawCard implements Transaction{
    
     private String id;
     private   double balance = 1000.00;

    public WithdrawCard()
    {
    }

    public WithdrawCard(WithCard card) {
        id=card.id;
    }
     
     public static class WithCard
     {
         private String id;
         private   double balance = 1000.00;
         
//         public WithCard(double value)
//         {
//             this.id=value;
//         }
         public WithCard()
         {
             
         }
         public WithCard id(String value)
         {
             id = value;
             return this;
         }
         public WithCard balance(double b)
         {
             balance = b;
             return this;
         }
         public WithdrawCard with()
         {
             return new WithdrawCard(this);
         }
     }
     
    public double excecute(double amo) 
    {
        
        double newAmount;
        if(amo >balance)
        {
            newAmount= 0;
        }
        else
        {
           newAmount = amo;
        }
        return newAmount;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.balance) ^ (Double.doubleToLongBits(this.balance) >>> 32));
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
        final WithdrawCard other = (WithdrawCard) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        return true;
    }
    
}
