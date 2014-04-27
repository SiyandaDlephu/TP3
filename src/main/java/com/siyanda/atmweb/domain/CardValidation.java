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
public class CardValidation  implements Serializable{
   
    private Long id;
    private String pinNumber;
    private String check;

    public CardValidation() {
    }

    public CardValidation(CardValidate card)
    {
        id = card.id;
        pinNumber = card.pinNumber;
        check = card.check;
    }
    
   public static class CardValidate
   {
       private Long id;
        private String pinNumber;
        private String check;
        
//        public CardValidate(String pinNu)
//        {
//            this.pinNumber =pinNu;
//        }
        
        public CardValidate()
        {
        }
        public CardValidate id(Long value)
        {
            id = value;
            return this;
        }
        
        public CardValidate pinNumber(String pin)
        {
            pinNumber = pin;
            return this;
        }
        public CardValidate check(String che)
        {
            check = che;
            return this;
        }
        public CardValidation cardvalidation()
        {
            return new CardValidation(this);
        }
   }

    public Long getId() {
        return id;
    }
    
   
    public String getPinNumber() {
        return pinNumber;
    }

    public String getCheck() {
        return check;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.pinNumber != null ? this.pinNumber.hashCode() : 0);
        hash = 17 * hash + (this.check != null ? this.check.hashCode() : 0);
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
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.pinNumber == null) ? (other.pinNumber != null) : !this.pinNumber.equals(other.pinNumber)) {
            return false;
        }
        if ((this.check == null) ? (other.check != null) : !this.check.equals(other.check)) {
            return false;
        }
        return true;
    }

    
    
    
}
