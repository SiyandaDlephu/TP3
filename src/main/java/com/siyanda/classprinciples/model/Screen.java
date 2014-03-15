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
public final class Screen extends Atm {
    
    private String id;
    private String message;

    public Screen() 
    {       
    }

    public Screen(DisplayMessageIn massag) {
        id=massag.id;
        message = massag.message;
    }
    
    public static class DisplayMessageIn
    {
         private String id;
         private String message;
         
         public DisplayMessageIn(String mas)
         {
             this.message=mas;
         }
         
         public DisplayMessageIn massage(String mas)
         {
             message = mas;
             return this;
         }
         
         public DisplayMessageIn id(String value)
         {
             id = value;
             return this;
         }
         
         public Screen screen()
         {
             return new Screen(this);
         }
    }
    
    public void displayMessage()
    {
        System.out.println(message);
        
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Screen other = (Screen) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
