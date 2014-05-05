///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.siyanda.atmweb.domain;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
///**
// *
// * @author inathi-zenande
// */
//@Entity
//public class Atm implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private boolean userAuthorized;
//    @Column(unique = true)
//    private String accNumber;
//    
//    @Embedded
//    private Screen screen;
//    
//    public Atm()
//    {
//    }
//
//    public Atm(AtmInner atmIn)
//    {
//        id = atmIn.id;
//        userAuthorized =atmIn.userAuthorized;
//        accNumber = atmIn.accNum;
//        screen = atmIn.screen;
//    }
//    
//    public static class AtmInner
//    {
//        private Long id;
//        private boolean userAuthorized;
//        private String accNum;
//        private Screen screen;
//        
//        public AtmInner(String acc)
//        {
//            this.accNum = accNum;
//        }
//        
//        public AtmInner id(Long value)
//        {
//            id = value;
//            return this;
//        }
//        
//        public AtmInner userAuthorized(boolean user)
//        {
//            userAuthorized = user;
//            return this;
//        }
//        /*public AtmInner accNum(String acc)
//        {
//            accNum = acc;
//            return this;
//        }*/
//        public AtmInner screen(Screen scr)
//        {
//            screen = scr;
//            return this;
//        }
//        public AtmInner atm(Atm at)
//        {
//            id = at.getId();
//            accNum = at.getAccNum();
//            userAuthorized = at.isUserAuthorized();
//            screen = at.getScreen();
//            return this;
//        }
//        
//        public Atm atm()
//        {
//            return new Atm(this);
//        }
//    }
//    
//    public Long getId() {
//        return id;
//    }
//
//    public boolean isUserAuthorized()
//    {
//        return userAuthorized;
//    }
//    
//    public String getAccNum()
//    {
//        return accNumber;
//    }
//
//    public Screen getScreen() {
//        return screen;
//    }
//    
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
//        hash = 47 * hash + (this.userAuthorized ? 1 : 0);
//        hash = 47 * hash + (this.accNumber != null ? this.accNumber.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Atm other = (Atm) obj;
//        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
//            return false;
//        }
//        if (this.userAuthorized != other.userAuthorized) {
//            return false;
//        }
//        if ((this.accNumber == null) ? (other.accNumber != null) : !this.accNumber.equals(other.accNumber)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.siyanda.atmweb.domain.Atm[ id=" + id + " ]";
//    }
//
//    
//
//    
//}
