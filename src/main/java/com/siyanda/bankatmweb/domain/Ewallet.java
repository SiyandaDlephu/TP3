/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
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
public class Ewallet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double withdraw;
    private String phoneNumber;
    private String password;

    @Embedded
    private LostCards lostcards;
    
    public Ewallet() {
    }

    public Ewallet(EwalletInner inner) {
        this.id = inner.id;
        this.password = inner.password;
        this.phoneNumber = inner.phoneNumber;
        this.withdraw = inner.withdraw;
        this.lostcards = inner.lostcards;
        
    }
 
    public static class EwalletInner
    {
        private Long id;
        private String phoneNumber;
        private String password;
        private double withdraw;
        private LostCards lostcards;

        public EwalletInner(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
         public EwalletInner id(Long value)
         {
             id = value;
             return this;
         }
          public EwalletInner password(String pass)
          {
              password = pass;
              return this;
          }
           public EwalletInner withdraw(double amount)
           {
               withdraw = amount;
               return this;
           }
          public EwalletInner lostcards(LostCards lost)
          {
              lostcards = lost;
              return this;
          }
          public EwalletInner ewlletinner(Ewallet wallet)
          {
              this.id = wallet.getId();
              this.password = wallet.getPassword();
              this.phoneNumber = wallet.getPhoneNumber();
              this.withdraw = wallet.getWithdraw();
              this.lostcards = wallet.getLostcards();
              return this;
          }
          public Ewallet ewallet()
          {
              return new Ewallet(this);
          }
        
    }

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public double getWithdraw() {
        return withdraw;
    }
    

    public LostCards getLostcards() {
        return lostcards;
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
        if (!(object instanceof Ewallet)) {
            return false;
        }
        Ewallet other = (Ewallet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.Ewallet[ id=" + id + " ]";
    }
    
}
