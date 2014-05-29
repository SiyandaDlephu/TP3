/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author inathi-zenande
 */
@Embeddable
public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact() {
    }

    public Contact(ContactInner inner) {
        this.phoneNumber = inner.phoneNumber;
        this.emailAddress = inner.emailAddress;
        this.name = inner.name;
    }

    public static class ContactInner
    {
        private String name;
        private String phoneNumber;
        private String emailAddress;

        public ContactInner(String phone) {
            this.phoneNumber=phone;
        }
        public ContactInner name(String name)
        {
            name = name;
            return this;
        }
        public ContactInner emailAddress(String email)
        {
            emailAddress = email;
            return this;
        }
        public ContactInner contactinner(Contact contact)
        {
            this.name = contact.getName();
            this.phoneNumber = contact.phoneNumber;
            this.emailAddress = contact.getEmailAddress();
            return this;
        }
        public Contact contact()
        {
            return new Contact(this);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }
    
    
}
