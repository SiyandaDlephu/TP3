/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embeddable;
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
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String accType;
    @Column(unique =true)
    private String accNumber;

    @Embedded
    private Savings savings;
    @Embedded
    private Check check;
    @Embedded
    private Credit credit;
    
    public Account() {
    }
    
    public Account(AccountInner inner)
    {
        id = inner.id;
        accType = inner.accType;
        accNumber = inner.accNumber;
        savings =inner.savings;
        check = inner.check;
        credit = inner.credit;
        
    }
    
    public static class AccountInner
    {
        private Long id;
        private String accType;
        private String accNumber;
        private Savings savings;
        private Check check;
        private Credit credit;

        public AccountInner(String accN) {
            this.accNumber =accN;
        }
        public AccountInner id(Long value)
        {
            id = value;
            return this;
        }
        public AccountInner accType(String accT)
        {
            accType = accT;
            return this;
        }
        public AccountInner credit(Credit value)
        {
            credit = value;
            return this;
        }
        public AccountInner savings(Savings value)
        {
            savings = value;
            return this;
        }
        public AccountInner check(Check value)
        {
            check = value;
            return this;
        }
        public AccountInner account(Account ac)
        {
            id = ac.getId();
            accType = ac.accType;
            accNumber = ac.accNumber;
            savings = ac.getSavings();
            check = ac.getCheck();
            credit = ac.getCredit();
            return this;
        }
        
        public Account account()
        {
            return new Account(this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public String getAccType() {
        return accType;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public Savings getSavings() {
        return savings;
    }

    public Check getCheck() {
        return check;
    }

    public Credit getCredit() {
        return credit;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.accType != null ? this.accType.hashCode() : 0);
        hash = 97 * hash + (this.accNumber != null ? this.accNumber.hashCode() : 0);
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
        final Account other = (Account) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.accType == null) ? (other.accType != null) : !this.accType.equals(other.accType)) {
            return false;
        }
        if ((this.accNumber == null) ? (other.accNumber != null) : !this.accNumber.equals(other.accNumber)) {
            return false;
        }
        return true;
    }
  
    
    
    @Override
    public String toString() {
        return "com.siyanda.atmweb.domain.Account[ id=" + id + " ]";
    }
    
}
