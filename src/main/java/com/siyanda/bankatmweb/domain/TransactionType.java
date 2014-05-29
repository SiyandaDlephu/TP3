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
public class TransactionType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String transaction;
    private String date;
    @Column(unique=true)
    private String time;
    
    
    @Embedded
    private BalanceInquery balanceinquery; 
    @Embedded
     private TransanctionSlip transactionslip;

    public TransactionType() {
    }

    public TransactionType(TransactionTypeInner inner)
    {
        this.id = inner.id;
        this.transaction = inner.transaction;
        this.date = inner.date;
        this.time = inner.time;
        this.balanceinquery = inner.balanceinquery;
        this.transactionslip = inner.transactionslip;        
    }
    
    
    
    public static class TransactionTypeInner
    {
        private Long id;
        private String transaction;
        private String date;
        private String time;
        private BalanceInquery balanceinquery;
        private TransanctionSlip transactionslip;

        public TransactionTypeInner(String time) {
            this.time = time;
        }
        
        public TransactionTypeInner id(Long value)
        {
            id = value;
            return this;
        }
        public TransactionTypeInner date(String date)
        {
            date = date;
            return this;
        }
         public TransactionTypeInner transaction(String trans)
         {
             transaction = trans;
             return this;
         }
        public TransactionTypeInner balanceinquery(BalanceInquery balance)
        {
            balanceinquery = balance;
            return this;
        }
        public TransactionTypeInner transactionslip(TransanctionSlip slip)
        {
            transactionslip = slip;
            return this;
        }
        
        public TransactionTypeInner transactiotypeinner(TransactionType type)
        {
            this.id = type.getId();
            this.transaction = type.getTransaction();
            this.date = type.getDate();
            this.time = type.getTime();
            this.balanceinquery = type.getBalanceinquery();
            this.transactionslip = type.getTransanctionslip();
            return this;
        }
        public TransactionType transactiontype()
        {
            return new TransactionType (this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getTransaction() {
        return transaction;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public BalanceInquery getBalanceinquery() {
        return balanceinquery;
    }

    public TransanctionSlip getTransanctionslip() {
        return transactionslip;
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
        if (!(object instanceof TransactionType)) {
            return false;
        }
        TransactionType other = (TransactionType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.TransactionType[ id=" + id + " ]";
    }
    
}
