/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

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
public class BankStatement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String accountNumber;
    private String  accountType;
    private String accountHolder;
    private String bankLocation;
    private double accountBalance;

    public BankStatement() {
    }

    public BankStatement(BankStatementInner inner) {
        this.id = inner.id;
        this.accountNumber = inner.accountNumber;
        this.accountType = inner.accountType;
        this.accountHolder = inner.accountHolder;
        this.bankLocation = inner.bankLocation;
        this.accountBalance = inner.accountBalance;
    }
    
    public static class BankStatementInner
    {
         private Long id;
        private String accountNumber;
        private String  accountType;
        private String accountHolder;
        private String bankLocation;
        private double accountBalance;

        public BankStatementInner(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public BankStatementInner id(Long value)
        {
            id = value;
            return this;
        }
        
        public BankStatementInner accountNumber(String accNum)
        {
            accountNumber = accNum;
            return this;
        }
        
        public BankStatementInner accountType(String accType)
        {
            accountType = accType;
            return this;
        }
        
        public BankStatementInner accountHolder(String accHolder)
        {
            accountHolder = accHolder;
            return this;
        }
        
        public BankStatementInner bankLocation(String loc)
        {
            bankLocation = loc;
            return this;
        }
        
        public BankStatementInner accountBalance(double balance)
        {
            accountBalance = balance;
            return this;
        }
        public BankStatementInner bankstatementinner(BankStatement state)
        {
            this.id = state.getId();
            this.accountNumber = state.getAccountNumber();
            this.accountType = state.getAccountType();
            this.accountHolder = state.getAccountHolder();
            this.bankLocation = state.bankLocation;
            return this;
        }
        public BankStatement bankstatement()
        {
            return new BankStatement(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getBankLocation() {
        return bankLocation;
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
        if (!(object instanceof BankStatement)) {
            return false;
        }
        BankStatement other = (BankStatement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.BankStatement[ id=" + id + " ]";
    }
    
}
