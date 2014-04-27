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
public class Screen  implements Serializable{
    
    private Long id;
    private String massage;

    public Screen() {
    }

    public Screen(ScreenMessage mess)
    {
        id = mess.id;
        massage = mess.massage;
    }
    
    public static class ScreenMessage
    {
        private Long id;
        private String massage;

        public ScreenMessage() {
        }
        
        public ScreenMessage id(Long value)
        {
            id = value;
            return this;
        }
        public ScreenMessage massage(String m)
        {
            massage = m;
            return this;
        }
        public Screen screen()
        {
            return new Screen (this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public String getMassage() {
        return massage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 37 * hash + (this.massage != null ? this.massage.hashCode() : 0);
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
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.massage == null) ? (other.massage != null) : !this.massage.equals(other.massage)) {
            return false;
        }
        return true;
    }
    
    
}
