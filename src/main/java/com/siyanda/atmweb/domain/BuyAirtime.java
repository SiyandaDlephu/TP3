/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class BuyAirtime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
    private String phoneNumber;
    
//    @Embedded
//    private NewBalance newbalance;
    
    public BuyAirtime() {
    }

    public BuyAirtime(BuyAirtimeInner phone)
    {
        id = phone.id;
        phoneNumber = phone.phoneNumber;
    }
    
    public static class BuyAirtimeInner
    {
        private Long id;
        private String phoneNumber;
        
        public BuyAirtimeInner(String phoneNumber)
        {
            this.phoneNumber =phoneNumber;
        }
        public BuyAirtimeInner id(Long value)
        {
            id = value;
            return this;
        }
        public BuyAirtimeInner phoneNumber(String phone)
        {
            phoneNumber = phone;
            return this;
        }
        public BuyAirtime buyairtime()
        {
            return new BuyAirtime(this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (this.phoneNumber != null ? this.phoneNumber.hashCode() : 0);
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
        final BuyAirtime other = (BuyAirtime) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.phoneNumber == null) ? (other.phoneNumber != null) : !this.phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.atmweb.domain.BuyAirtime[ id=" + id + " ]";
    }

   
    
}
