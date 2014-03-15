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
public  final class WithdrawAccount implements Cardless{

    private String id;
    private int cell;

    public WithdrawAccount()
    {
    }

    public WithdrawAccount(WithAccountt withAccount) 
    {
        id=withAccount.id;
    }
    
    public static class WithAccountt
    {
        private String id;
        
        public WithAccountt()
        {
        }

        public WithAccountt id(String value)
        {
            this.id = value;
            return this;
        }
       
        
        public WithdrawAccount account()
        {
            return new WithdrawAccount(this);
        }
               
    }

    public String getId()
    {        
        return id;
    }    
       
    public int cellNumber() 
    {       
         cell = 07123456;
            return cell;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + this.cell;
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
        final WithdrawAccount other = (WithdrawAccount) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if (this.cell != other.cell) {
            return false;
        }
        return true;
    }

   
    
    
}
