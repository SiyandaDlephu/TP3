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
public class DeletedAccounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String accountNumberdeleted;
    private String dateDeleted;

    public DeletedAccounts() {
    }

    public DeletedAccounts(DeletedAccountsInner inner)
    {
        this.id = inner.id;
        this.accountNumberdeleted = inner.accountNumberdeleted;
        this.dateDeleted = inner.dateDeleted;
    }   
    
    public static class DeletedAccountsInner
    {
        private Long id;
        private String accountNumberdeleted;
        private String dateDeleted;

        public DeletedAccountsInner(String accountNumberdeleted) 
        {
            this.accountNumberdeleted = accountNumberdeleted;
        }
        public DeletedAccountsInner id(Long value)
        {
            id = value;
            return this;
        }
        public DeletedAccountsInner dateDeleted(String date)
        {
            dateDeleted = date;
            return this;
        }
        public DeletedAccountsInner deletedaccountinner(DeletedAccounts deleted)
        {
            this.id = deleted.getId();
            this.accountNumberdeleted = deleted.getAccountNumberdeleted();
            this.dateDeleted = deleted.getDateDeleted();
            return this;
        }
        public DeletedAccounts deletedaccounts()
        {
            return new DeletedAccounts(this);
        }
        
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumberdeleted() {
        return accountNumberdeleted;
    }

    public String getDateDeleted() {
        return dateDeleted;
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
        if (!(object instanceof DeletedAccounts)) {
            return false;
        }
        DeletedAccounts other = (DeletedAccounts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.DeletedAccounts[ id=" + id + " ]";
    }
    
}
