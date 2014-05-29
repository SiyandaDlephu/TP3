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
public class Atm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String atmLocation;
    private String changePin;
   // private boolean vardcalidation;
    private String screen;

     public Atm() {
    }

    public Atm(AtmInner inner) 
    {
        this.id = inner.id;
        this.atmLocation = inner.atmLocation;
        this.changePin = inner.changePin;
       // this.vardcalidation = inner.vardcalidation;
        this.screen = inner.screen;
//        this.withdraw = inner.withdraw;
//        this.deposit = inner.deposit;
//        this.buyAitime = inner.buyAitime;
        
    }
    
    public static class AtmInner
    {
        private Long id;
        private String atmLocation;
        private String changePin;
     //   private boolean vardcalidation;
        private String screen;
//        private String withdraw;
//        private String deposit;
//        private String buyAitime;
//        
        public AtmInner(String atmLoc) {
            this.atmLocation = atmLoc;
        }
        
        public AtmInner id(Long value)
        {
            id = value;
            return this;
        }
         public AtmInner changePin(String changePin)
        {
            this.changePin = changePin;
            return this;
        }
       /*   public AtmInner vardcalidation(boolean vardcalidation)
        {
            this.vardcalidation = vardcalidation;
            return this;
        }*/
           public AtmInner screen(String screen)
        {
            this.screen = screen;
            return this;
        }
//         public AtmInner withdraw(String withdraw)
//        {
//            withdraw = withdraw;
//            return this;
//        } public AtmInner deposit(String deposit)
//        {
//            deposit = deposit;
//            return this;
//        }
//         public AtmInner buyAitime(String buyAitime)
//        {
//            buyAitime = buyAitime;
//            return this;
//        }
         
         
        
        public AtmInner atminner(Atm atm)
        {
            this.id = atm.getId();
            this.atmLocation = atm.getAtmLocation();
            this.changePin = atm.getChangePin();
            //this.vardcalidation = atm.isVardcalidation();
            this.screen = atm.getScreen();
            return this;
        }
        public Atm atm()
        {
            return new Atm(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getAtmLocation() {
        return atmLocation;
    }
    

//    public String getWithdraw() {
//        return withdraw;
//    }
//
//    public String getDeposit() {
//        return deposit;
//    }
//
//    public String getBuyAitime() {
//        return buyAitime;
//    }

    public String getChangePin() {
        return changePin;
    }

   /* public boolean isVardcalidation() {
        return vardcalidation;
    }*/

    public String getScreen() {
        return screen;
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
        if (!(object instanceof Atm)) {
            return false;
        }
        Atm other = (Atm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.aaaaaaa[ id=" + id + " ]";
    }
    
}
