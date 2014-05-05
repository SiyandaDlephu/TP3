/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Ewallet implements Serializable{
    
    private Long id;
    private String phoneNum;
    private String pinNum;

//    @Embedded
//    private WithdrawEwallet withdrawewallet;
    
    public Ewallet() {
    }
    
    public Ewallet(EwalletInner inner)
    {
        id = inner.id;
        phoneNum = inner.phoneNum;
        pinNum = inner.pinNum;        
    }
    
    public static class EwalletInner
    {
        private Long id;
        private String phoneNum;
        private String pinNum;

        public EwalletInner() {
        }
        
        public EwalletInner id(Long value)
        {
            id = value;
            return this;
        }
        public EwalletInner phoneNum(String phone)
        {
            phoneNum = phone;
            return this;
        }
        public EwalletInner pinNum(String pin)
        {
            pinNum = pin;
            return this;
        }
        public Ewallet ewallet()
        {
            return new Ewallet(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPinNum() {
        return pinNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 19 * hash + (this.phoneNum != null ? this.phoneNum.hashCode() : 0);
        hash = 19 * hash + (this.pinNum != null ? this.pinNum.hashCode() : 0);
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
        final Ewallet other = (Ewallet) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.phoneNum == null) ? (other.phoneNum != null) : !this.phoneNum.equals(other.phoneNum)) {
            return false;
        }
        if ((this.pinNum == null) ? (other.pinNum != null) : !this.pinNum.equals(other.pinNum)) {
            return false;
        }
        return true;
    }
    
    
}
