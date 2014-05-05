/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.atmweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class CardExpired implements Serializable{
    
    private Long id;
    private String dataExp;

    public CardExpired() {
    }

    public CardExpired(CheckCard check)
    {
        dataExp = check.dataExp;
    }
    
    public static class CheckCard
    {
          private String dataExp;
          private Long id;
          
          public CheckCard()
          {}
          
//          public CheckCard(Long value)
//          {
//              this.id=value;
//          }
          public CheckCard id(Long value)
          {
              id = value;
              return this;
          }
          public CheckCard dataExp(String dateEx)
          {
              dataExp = dateEx;
              return this;
          }
          public CheckCard cardexpired(CardExpired ce)
          {
              id = ce.getId();
              dataExp = ce.getDataExp();
              return this;
          }
       
          public CardExpired expired()
          {
              return new CardExpired(this);
          }
    }

    public String getDataExp() {
        return dataExp;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 47 * hash + (this.dataExp != null ? this.dataExp.hashCode() : 0);
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
        final CardExpired other = (CardExpired) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.dataExp == null) ? (other.dataExp != null) : !this.dataExp.equals(other.dataExp)) {
            return false;
        }
        return true;
    }
    

   
     
    
    
}
