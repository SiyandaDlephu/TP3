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
public final class Withdraw implements Cardless
{
    private String id;
    private boolean amount;
    
    private Withdraw()
    {
    }
    
    private Withdraw(Money money)
    {
        id=money.id;
        amount=money.amount;
    }

    public int cellNumber() {
        int cell = 07123456;
            return cell;
    }
    
    public static class Money
    {
        private String id;
        private boolean amount;

        public Money(boolean amount) {
            this.amount= amount;
        }
        
        public Money id(String value)
        {
            id = value;
            return this;
        }
        
        public Money amount(boolean amo)
        {
            amount = amo;
            return this;           
        }
        
        public Withdraw cash()
        {
            return new Withdraw(this);
        }
    }

    public String getId() {
        return id;
    }

    public boolean isAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode(); 
    }
    
    
}
