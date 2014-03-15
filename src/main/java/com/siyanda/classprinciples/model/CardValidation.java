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
public final class CardValidation {
    
    private String id;
    private int pinNum;

    public CardValidation() {
    }

    public CardValidation(Validation val) {
        id = val.id;
        pinNum = val.pinNum;
    }
    
    public static class Validation
    {
         private String id;
         private int pinNum;
         
         public Validation(int pin)
         {
             this.pinNum =pin;
         }
         
         public Validation id(String value)
         {
             id = value;
             return this;
         }
         public Validation pinNum(int pinN)
         {
             pinNum=pinN;
             return this;
         }
         public CardValidation card()
         {
             return new CardValidation(this);
         }
    }

    public String getId() {
        return id;
    }

    public int getPinNum() {
        return pinNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + this.pinNum;
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
        final CardValidation other = (CardValidation) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (this.pinNum != other.pinNum) {
            return false;
        }
        return true;
    }
    
}
