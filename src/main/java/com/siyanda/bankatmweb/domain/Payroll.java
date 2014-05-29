/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siyanda.bankatmweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inathi-zenande
 */
@Entity
public class Payroll implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double salary;
    private int hours;
    private double tax;
    private String payrollId;

    public Payroll() {
    }

    public Payroll(PayrollInner inner) {
        this.id = inner.id;
        this.salary = inner.salary;
        this.hours = inner.hours;
        this.tax = inner.tax;
        this.payrollId = inner.payrollId;
    }
    
    public static class PayrollInner
    {
        private Long id;
        private double salary;
        private int hours;
        private double tax;
        private String payrollId;

        public PayrollInner(String payroallId) {
            this.payrollId = payrollId;
        }
        public PayrollInner id(Long value)
        {
            id = value;
            return this;
        }
        public PayrollInner salary(double amount)
        {
           salary = amount; 
           return this;
        }
        public PayrollInner hours(int time)
        {
            hours = time;
            return this;
        }
        public PayrollInner tax(double tax)
        {
            tax = tax;
             return this;
        }
        public PayrollInner payrollinner(Payroll pay)
        {
            this.id = pay.getId();
            this.salary = pay.getSalary();
            this.hours = pay.getHours();
            this.tax = pay.getTax();
            this.payrollId = pay.getPayrollId();
            return this;
        }
        public Payroll payroll()
        {
            return new Payroll(this);
        }
    }

    public Long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public double getTax() {
        return tax;
    }

    public String getPayrollId() {
        return payrollId;
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
        if (!(object instanceof Payroll)) {
            return false;
        }
        Payroll other = (Payroll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siyanda.bankatmweb.domain.Payroll[ id=" + id + " ]";
    }
    
}
