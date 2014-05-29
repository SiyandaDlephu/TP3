/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import java.util.List;
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
public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    private String bankName;
    @Column(unique = true)
    private String bankNumber;
    
    @OneToMany
    @JoinColumn(name="bank_id")
    List<Person> person;
//    
//    @OneToMany
//    @JoinColumn(name="bank_id")
//    List<Atm> atm;

    public Bank() {
    }

    public Bank(BankInner inner) {
      this.id = inner.id;
      this.bankNumber = inner.bankNumber;
      this.bankName = inner.bankName;
      this.location = inner.location;
      this.person = inner.person;
      //this.atm = inner.atm;
    }

    public static class BankInner
    {
        private Long id;
        private String bankNumber;
        private String location;
        private String bankName;
        List<Person> person;
       // List<Atm> atm;

        public BankInner(String number) {
            this.bankNumber=number;
        }
        public BankInner id(Long value)
        {
            id = value;
            return this;
        }
        public BankInner bankNumber(String num)
        {
            bankNumber = num;
            return this;
        }
        public BankInner location(String loc)
        {
            location = loc;
            return this;
        }
        public BankInner bankName(String name)
        {
            bankName = name;
            return this;
        }
        public BankInner person(List<Person> person)
        {
            person = person;
            return this;
        }
//        public BankInner atm(List<Atm> atm)
//        {
//            atm = atm;
//            return this;
//        }
        
        public BankInner bankinner(Bank bank)
        {
            this.id = bank.getId();
            this.location = bank.getLocation();
            this.bankName = bank.getBankName();
            this.bankNumber = bank.getBankName();
            this.person =bank.getPerson();
           // this.atm = bank.getAtm();
            return this;
        }
        public Bank bank()
        {
            return new Bank(this);
        }
        
    }
    
    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public List<Person> getPerson() {
        return person;
    }

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
        if (!(object instanceof Bank)) {
            return false;
        }
        Bank other = (Bank) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.Bank[ id=" + id + " ]";
    }
    
}
