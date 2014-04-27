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
public class LostCard implements Serializable{
    
    private Long id;
    private String accNum;
    private String pinNum;

    public LostCard() {
    }

    public LostCard(LostCardInner inner)
    {
        id = inner.id;
        accNum =inner.accNum;
        pinNum =inner.pinNum;
    }
    
    public static class LostCardInner
    {
         private Long id;
         private String accNum;
         private String pinNum;

        public LostCardInner() {
        }
         
        public LostCardInner id(Long value)
        {
            id = value;
            return this;
        }
        public LostCardInner pinNum(String num)
        {
            pinNum = num;
            return this;
        }
        public LostCardInner accNum(String acc)
        {
            accNum = acc;
            return this;
        }
        public LostCard lostcard()
        {
            return new LostCard(this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getPinNum() {
        return pinNum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (this.accNum != null ? this.accNum.hashCode() : 0);
        hash = 83 * hash + (this.pinNum != null ? this.pinNum.hashCode() : 0);
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
        final LostCard other = (LostCard) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.accNum == null) ? (other.accNum != null) : !this.accNum.equals(other.accNum)) {
            return false;
        }
        if ((this.pinNum == null) ? (other.pinNum != null) : !this.pinNum.equals(other.pinNum)) {
            return false;
        }
        return true;
    }
    
    
}
