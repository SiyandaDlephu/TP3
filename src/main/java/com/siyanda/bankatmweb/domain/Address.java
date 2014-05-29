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
public class Address {
    private int houseNumber;
    private String street;
    private String town;
    private String province;
    private String country;

    public Address() {
    }
    public Address(AddreeInner inner)
    {
        this.houseNumber = inner.houseNumber;
        this.street = inner.street;
        this.town = inner.town;
        this.province = inner.province;
        this.country = inner.country;
    }

    public static class AddreeInner
    {
        private int houseNumber;
         private String street;
        private String town;
        private String province;
        private String country;

        public AddreeInner(int house) {
           this.houseNumber =house;
        }
        public AddreeInner street(String street) {
            street = street;
             return this;
        }
        public AddreeInner town(String town) {
            town = town;
            return this;
        }
        public AddreeInner province(String province) {
            province = province;
            return this;
        }
         public AddreeInner country(String country) {
             country =country;
              return this;
        }
        
        public AddreeInner addressinner(Address address)
        {
            this.houseNumber = address.getHouseNumber();
            this.street = address.getStreet();
            this.town = address.getTown();
            this.province = address.getProvince();
            this.country = address.getCountry();
            return this;
        }
        public Address address()
        {
            return new Address(this);
        }
    }

    public int getHouseNumber() {
        return houseNumber;
    }
    
    
    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }
    
    
}
