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
public final class ChangePin implements Transaction{
    
    private String id;
    private int oldPin;
    private int newPin;

    public ChangePin()
    {
    }

    public ChangePin(Change change) {
        id = change.id;
        oldPin =change.oldPin;
        newPin = change.newPin;
    }

    public double excecute(double amo) {
        return 0;
    }

    
    
    public static class Change
    {
        private String id;
        private int oldPin;
        private int newPin;
        
        public Change(int oldPin)
        {
            this.oldPin =oldPin;
        }
        
        public Change id(String value)
        {
            id = value;
            return this;
        }
        public Change oldPin(int old)
        {
            oldPin = old;
            return this;
        }
        public Change newPin(int newP)
        {
            newPin = newP;
            return this;
        }
        
        public ChangePin changeP()
        {
            return new ChangePin(this);
        }
    }

    public String getId() {
        return id;
    }
    

    public int getOldPin() {
        return oldPin;
    }

    public int getNewPin() {
        return newPin;
    }
    
    
    
    public int changePinNumber()
    {
        if(oldPin == oldPin)
            return 0;
        else 
            return newPin;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 23 * hash + this.oldPin;
        hash = 23 * hash + this.newPin;
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
        final ChangePin other = (ChangePin) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (this.oldPin != other.oldPin) {
            return false;
        }
        if (this.newPin != other.newPin) {
            return false;
        }
        return true;
    }

    
    
}
