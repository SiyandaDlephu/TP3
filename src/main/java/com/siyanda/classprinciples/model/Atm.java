/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.classprinciples.model;

/**
 *
 * @author inathi-zenande
 */
public class Atm {

    private String id;
    private boolean userAuthorized;
   
    public Atm() 
    {
        
    }

    public Atm(AtmInner atmIn) 
    {
        id =atmIn.id;
        userAuthorized = atmIn.userAuthorized;
    }

    public static class AtmInner
    {
        private String id;
        private boolean userAuthorized;
        
        public AtmInner(boolean userAuthorized) 
        {
            this.userAuthorized = userAuthorized;
        }
        
        public AtmInner id(String value)
        {
            id = value;
            return this;
        }
        
        public AtmInner userAuthorized(boolean user)
        {
            userAuthorized = user;
            return this;
        }
        
        public Atm atm()
        {
            return new Atm(this);
        }
    }

    public String getId() {
        return id;
    }
    
    
    public boolean isUserAuthorized()
    {
        return userAuthorized;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.userAuthorized ? 1 : 0);
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
        final Atm other = (Atm) obj;
        if (this.userAuthorized != other.userAuthorized) {
            return false;
        }
        return true;
    }
    
   
}
