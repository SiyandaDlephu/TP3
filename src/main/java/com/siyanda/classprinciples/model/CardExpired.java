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
public final class CardExpired {//extends Atm {
    
    private String id;

    public String getId() {
        return id;
    }
    
    public boolean expired()
    {
        return false;
    }

    public CardExpired()
    {
    }
    
    
    public CardExpired(CheckCard check)
    {
        id=check.id;
    }
    
    public static class CheckCard
    {
        private String id;
        
        public CheckCard()
        {
        }
        
        public CheckCard(String value)
        {
            this.id=value;
        }
        public CheckCard id(String value)
        {
            id = value;
            return this;
        }
        
        public CardExpired expired()
        {
            return new CardExpired(this);
        }
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final CardExpired other = (CardExpired) obj;
        return true;
    }
    
}
