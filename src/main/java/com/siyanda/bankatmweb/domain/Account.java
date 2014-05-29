/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import javax.persistence.Column;
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
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      private String  accType;
    private String accHolder;
  // @Column(unique=true)
    private String accNumber;
  
    
    @Embedded
    private Savings savings;
    @Embedded
    private Cheque cheque;
    @Embedded
    private Credit credit;

    public Account() {
    }

    public Account(AccountInner inner) {
        this.id = inner.id;
        this.accNumber = inner.accNumber;
        this.accHolder = inner.accHolder;
        this.accType = inner.accType;
        this.savings = inner.savings;
        this.cheque = inner.cheque;
        this.credit = inner.credit;
        
    }

    public static class AccountInner
    {
        private Long id;
        private String accType;
        private String accNumber;
        private String accHolder;
        private Savings savings;
        private Cheque cheque;
        private Credit credit;

        public AccountInner(String accNum) {
            this.accNumber = accNum;
        }
        
        public AccountInner accType(String type)
        {
            accType = type;
            return this;
        }
        public AccountInner id(Long value)
        {
            id = value;
            return this;
        }
         public AccountInner accHolder(String holder)
        {
            accHolder = holder;
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
        public AccountInner cheque(Cheque value)
        {
            cheque = value;
            return this;
        }
        public AccountInner account(Account ac)
        {
            id = ac.getId();
            accType = ac.getAccType();
            accHolder = ac.getAccHolder();
            accNumber = ac.getAccNumber();
            savings = ac.getSavings();
            cheque = ac.getCheque();
            credit = ac.getCredit();
            return this;
        }
        
        public Account account()
        {
            return new Account(this);
        }

        public Account build() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getAccHolder() {
        return accHolder;
    }

    public Savings getSavings() {
        return savings;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public Credit getCredit() {
        return credit;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.Account[ id=" + id + " ]";
    }
    
}
