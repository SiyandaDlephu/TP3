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
public final class Deposite implements Transaction{
    
    private String id;

    public Deposite()
    {
    }

    public Deposite(Depo d)
    {
        id=d.id;
    }
    
    public double excecute(double amo)
    {
        double amount = 120.00;
        return amount;
    }
    
    public static class Depo
    {
         private String id;
         
         public Depo()
         {
            
         }
         public Depo id(String v)
         {
             id = v;
             return this;
         }
         
         public Deposite posit()
         {
             return new Deposite(this);
         }
    }
    
    

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Deposite other = (Deposite) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
