/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
    private String firstname;
    @Column(unique = true)
    private String pinNumber;
    
    @Embedded
    private ChangePin changepin;
//    @Embedded
//    private CardExpired cardexpired;
//    @Embedded
//    private CardValidation cardvalidation;
//    
//    @OneToMany
//    @JoinColumn(name="customer_id")
//    List<RegisterPhone> registerphone;
//    
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="customer_id")
//    List<Atm> atm;
    

    
    public AtmCustomer(){
    }
    public AtmCustomer(Customer customer)
    {
        id = customer.id;
        firstname = customer.firstname;
        pinNumber = customer.pinNumber;
        changepin =customer.changepin;
//        cardexpired =customer.cardexpired;
//        cardvalidation = customer.cardvalidation;
//        registerphone =customer.registerphone;
//        atm =customer.atm;
    }
    
    public static class Customer
    {
        private Long id;
        private String firstname;
        private String pinNumber;
        private ChangePin changepin;
        private CardExpired cardexpired;
        private CardValidation cardvalidation;
//        List<RegisterPhone> registerphone;
//        List<Atm> atm;
        
        public Customer(String pin)
        {
            this.pinNumber = pin;
        }
        public Customer changepin(ChangePin value)
        {
            changepin = value;
            return this;
        }
//        public Customer cardexpired(CardExpired c)
//        {
//            cardexpired = c;
//            return this;
//        }
//        public Customer cardvalidation(CardValidation cv)
//        {
//            cardvalidation = cv;
//            return this;
//        }
//        public Customer registerphone(List<RegisterPhone> value)
//        {
//            registerphone = value;
//            return this;
//        }
//        public Customer atm(List<Atm> value)
//        {
//            atm = value;
//            return this;
//        }
        public Customer id(long value)
        {
            id = value;
            return this;
        }
        public Customer firstname(String name)
        {
            firstname = name;
            return this;
        }
        public Customer atmcustomer(AtmCustomer atmcust)
        {
            id = atmcust.getId();
            firstname = atmcust.getFirstname();
            pinNumber = atmcust.getPinNumber();
            changepin = atmcust.getChangepin();
//            cardexpired =atmcust.getCardexpired();
//            cardvalidation =atmcust.getCardvalidation();
//            registerphone = atmcust.getRegisterphone();
 //           atm = atmcust.getAtm();
            return this;
        }
     
         public AtmCustomer atmcust()
        {
            return new AtmCustomer(this);
        }

//        public Object atmcust(AtmCustomer atmcus) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public Object atmcust(AtmCustomer atmcus) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    }
    
    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public ChangePin getChangepin() {
        return changepin;
    }
//
//    public CardExpired getCardexpired() {
//        return cardexpired;
//    }
//
//    public CardValidation getCardvalidation() {
//        return cardvalidation;
//    }
//
//    public List<RegisterPhone> getRegisterphone() {
//        return registerphone;
//    }
//
//    public List<Atm> getAtm() {
//        return atm;
//    }

    

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
        return "com.siyanda.atmweb.domain.AtmCustomer[ id=" + id + " ]";
    }
    
}
