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
public final class BuyAirtime implements Transaction{
    
    private String id;
    private String phoneNum;

    public BuyAirtime() 
    {
    }

    public BuyAirtime(BuyAir air)
    {
        id=air.id;
       
        phoneNum=air.phoneNum;
     }

    
     public double excecute(double amo)
        {
           double amount  = 120.00;
            return amount;

        }
    
    public static class BuyAir
    {
        private String id;
        private double amount;
        private String phoneNum;
        
        public BuyAir(String phone)
        {
            this.phoneNum = phone;
        }
        
        public BuyAir id(String value)
        {
            id = value;
            return this;
        }

        
        public BuyAirtime airtime()
        {
            return new BuyAirtime(this);
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
        int hash = 5;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 37 * hash + (this.phoneNum != null ? this.phoneNum.hashCode() : 0);
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
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.phoneNum == null) ? (other.phoneNum != null) : !this.phoneNum.equals(other.phoneNum)) {
            return false;
        }
        return true;
    }

   
    
    
}
