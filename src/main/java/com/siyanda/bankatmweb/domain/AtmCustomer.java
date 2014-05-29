/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class AtmCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custAccountNumber;
    private String custPinNumber;

    public AtmCustomer() {
    }

    public AtmCustomer(AtmCustomerInner inner) 
    {
        this.id = inner.id;;
        this.custAccountNumber = inner.custAccountNumber;
        this.custPinNumber = inner.custPinNumber;
    }

    public static class AtmCustomerInner
    {
        private Long id;
        private String custAccountNumber;
        private String custPinNumber;

        public AtmCustomerInner(String custPinNumber) {
            this.custPinNumber = custPinNumber;
        }
        public AtmCustomerInner id(Long value)
        {
            id = value;
            return this;
        }
        public AtmCustomerInner custAccountNumber(String accNum)
        {
            custAccountNumber = accNum;
            return this;
        }
        public AtmCustomerInner atmcustomerinner(AtmCustomer customer)
        {
            this.id = customer.getId();
            this.custAccountNumber = customer.getCustAccountNumber();
            this.custPinNumber = customer.getCustPinNumber();
            return this;
        }
        public AtmCustomer atmcustomer()
        {
            return new AtmCustomer(this);
        }
               
    }
    
    public Long getId() {
        return id;
    }

    public String getCustAccountNumber() {
        return custAccountNumber;
    }

    public String getCustPinNumber() {
        return custPinNumber;
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
        if (!(object instanceof AtmCustomer)) {
            return false;
        }
        AtmCustomer other = (AtmCustomer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.AtmCustomer[ id=" + id + " ]";
    }
    
}
