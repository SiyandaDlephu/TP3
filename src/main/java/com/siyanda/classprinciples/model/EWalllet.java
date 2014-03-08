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
public abstract class EWalllet implements Cardless{

    private String id;
    private int cell;
    
    private EWalllet()
    {
    }
    
    private EWalllet(Wallet wallet)
    {
        id=wallet.id;
        cell=wallet.cell;
    }
    
    public static class Wallet
    {
        private String id;
        private int cell;

        public Wallet(int i) {
             this.cell = i;
        }
        
        public Wallet id(String value)
        {
            id = value;
            return this;
        }
        
        public Wallet cell(int cel)
        {
            cell = cel;
            return this;
        }
        
        public EWalllet wal()
        {
            return new EWalllet(this) {};
        }
    }
    
     public int getCell() {
        return cell;
     }
     
    public String getId() {
        return id;

    }
    

    public int cellNumber() {
        
        int cellNum = 10111;

            return cellNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final EWalllet other = (EWalllet) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
