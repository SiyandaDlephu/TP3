/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String surname;
    private String gender;
    @Column(unique=true)
    private String identification;
    
    @Embedded
    private Address address;
    @Embedded
    private Contact contact;
        
    @OneToMany
    @JoinColumn(name ="person_id")
    List<Payroll> payroll;

    public Person() {
    }

    public Person(PersonInner inner) {
        this.id = inner.id;
        this.firstName = inner.firstName;
        this.surname = inner.surname;
        this.gender = inner.gender;
        this.address = inner.address;
        this.contact = inner.contact;
        this.identification = inner.identification;
        this.payroll = inner.payroll;
    }
    
    
    public static class PersonInner
    {
        private Long id;
        private String firstName;
        private String surname;
        private String gender;
        private Address address;
        private Contact contact;
        private String identification;
        List<Payroll> payroll;

        public PersonInner(String ident) {
            this.identification=ident;
        }
        public PersonInner id(Long value)
        {
            id = value;
            return this;
        }
        public PersonInner firstName(String firstName)
        {
            firstName = firstName;
            return this;
        }
        public PersonInner surname(String surname)
        {
            surname = surname;
             return this;
        }
        public PersonInner address(Address ad)
        {
            address = ad;
            return this;
        }
        public PersonInner contact(Contact cont)
        {
            contact = cont;
            return this;
        }
         public PersonInner gender(String gender)
         {
             gender = gender;
             return this;
         }
         public PersonInner payroll(List<Payroll> roll)
         {
             payroll = roll;
             return this;
         }
   
        public PersonInner personinner(Person person)
        {
            this.id = person.getId();
            this.firstName = person.getFirstName();
            this.surname = person.getSurname();
            this.gender = person.getGender();
            this.address = person.getAddress();
            this.contact = person.getContact();
            this.payroll = person.getPayroll();
            return this;
        }
        public Person person()
        {
            return new Person(this);
        }
        
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public String getIdentification() {
        return identification;
    }

    public List<Payroll> getPayroll() {
        return payroll;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.Person[ id=" + id + " ]";
    }
    
}
