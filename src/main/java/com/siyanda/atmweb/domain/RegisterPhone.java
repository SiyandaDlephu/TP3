/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class RegisterPhone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    
    public RegisterPhone() {
    }

    public RegisterPhone(Registerphone phone)
    {
        id = phone.id;
        phoneNumber = phone.phoneNumber;
    }
    
    public static class Registerphone
    {
        private Long id;
        private String phoneNumber;
        
        public Registerphone(String phoneNumber)
        {
            this.phoneNumber =phoneNumber;
        }
        public Registerphone id(Long value)
        {
            id = value;
            return this;
        }
        public Registerphone phoneNumber(String phone)
        {
            phoneNumber = phone;
            return this;
        }
        public RegisterPhone register()
        {
            return new RegisterPhone(this);
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegisterPhone)) {
            return false;
        }
        RegisterPhone other = (RegisterPhone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "com.siyanda.atmweb.domain.RegisterPhone[ id=" + id + " ]";
    }
//
//    @Override
//    public String toString() {
//        return "RegisterPhone{" + "id=" + id + ", phoneNumber=" + phoneNumber + '}';
//    }
    
}
