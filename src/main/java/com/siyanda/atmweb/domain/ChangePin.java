/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class ChangePin implements Serializable{
    
    private Long id;
    private String oldPin;
    private String newPIn;

    public ChangePin() {
    }
    public ChangePin(ChangingPin change)
    {
         id = change.id;
        oldPin = change.oldPin;
        newPIn = change.newPIn;
    }
    
    public static class ChangingPin
    {
        private Long id;
        private String oldPin;
        private String newPIn;
        
        public ChangingPin(String old)
        {
            this.oldPin = old;
        }
        public ChangingPin oldPin(String old)
        {
            oldPin = old;
            return this;
        }
        public ChangingPin newPIn(String newP)
        {
            newPIn = newP;
            return this;
        }
        public ChangingPin id(Long value)
        {
            id = value;
            return this;
        }
        public ChangePin changepin()
        {
            return new ChangePin(this);
        }
    }

    public String getOldPin() {
        return oldPin;
    }

    public String getNewPIn() {
        return newPIn;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 13 * hash + (this.oldPin != null ? this.oldPin.hashCode() : 0);
        hash = 13 * hash + (this.newPIn != null ? this.newPIn.hashCode() : 0);
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
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.oldPin == null) ? (other.oldPin != null) : !this.oldPin.equals(other.oldPin)) {
            return false;
        }
        if ((this.newPIn == null) ? (other.newPIn != null) : !this.newPIn.equals(other.newPIn)) {
            return false;
        }
        return true;
    }
    
    
   

   
    
    
}
