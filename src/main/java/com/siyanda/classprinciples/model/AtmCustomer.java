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
public final class AtmCustomer {
    
    private String id;
    private int accNumber;
    private String name;

    public AtmCustomer() 
    {
    }

    public AtmCustomer(Customer customer) {
        
        id = customer.id;
        accNumber = customer.accNumber;
        name = customer.name;
    }
    
    public static class Customer
    {
        private String id;
        private int accNumber;
        private String name;
        
        public Customer(String name)
        {
            this.name=name;
        }
        
        public Customer id(String value)
        {
            id = value;
            return this;
        }
        
        public Customer name(String n)
        {
            name = n;
            return this;
        }
        
        public Customer accNumber(int acc)
        {
            accNumber = acc;
            return this;
        }
        
        public AtmCustomer atmcust()
        {
            return new AtmCustomer(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 23 * hash + this.accNumber;
        hash = 23 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final AtmCustomer other = (AtmCustomer) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (this.accNumber != other.accNumber) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
