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
public final class RegisterPhone implements Transaction{
    
    private String id;
    private String phoneNum;

    public RegisterPhone()
    {
    }

    public RegisterPhone(PhoneNumber phone) {
        id=phone.id;
        phoneNum=phone.phoneNum;
    }

    public double excecute(double amo) {
        return 0;
        
    }
    
    public static class PhoneNumber
    {
        private String id;
        private String phoneNum;
        
        public PhoneNumber(String num)
        {
            this.phoneNum=num;
        }
        
        public PhoneNumber id(String value)
        {
            id = value;
            return this;
        }
        
        public PhoneNumber phoneNum(String num)
        {
            phoneNum = num;
            return this;
        }
        
        public RegisterPhone phone()
        {
            return new RegisterPhone(this);
        }
    }
    
    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.phoneNum != null ? this.phoneNum.hashCode() : 0);
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
        final RegisterPhone other = (RegisterPhone) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.phoneNum == null) ? (other.phoneNum != null) : !this.phoneNum.equals(other.phoneNum)) {
            return false;
        }
        return true;
    }
    
    
}
