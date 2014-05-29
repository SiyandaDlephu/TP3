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
public class TransanctionSlip {
    private String transactionTypes;
    private double amount;
    private String transactionTime;

    public TransanctionSlip() {
    }

    public TransanctionSlip(TransanctionSlipInner inner) {
        this.amount = inner.amount;
        this.transactionTime = inner.transactionTime;
        this.transactionTypes = inner.transactionTypes;
    }
    
    public static class TransanctionSlipInner
    {
        private String transactionTypes;
        private double amount;
        private String transactionTime;

        public TransanctionSlipInner(String time) {
            this.transactionTime = time;
        }
        public TransanctionSlipInner amount(double cash)
        {
            amount = cash;
            return this;
        }
        public TransanctionSlipInner transactionTypes(String type)
        {
            transactionTypes = type;
            return this;
        }
        public TransanctionSlipInner transactionslipinner(TransanctionSlip slip)
        {
            this.amount = slip.getAmount();
            this.transactionTime = slip.getTransactionTime();
            this.transactionTypes = slip.getTransactionTypes();
            return this;
        }
        public TransanctionSlip transactionslip()
        {
            return new TransanctionSlip (this);
        }
    }

    public String getTransactionTypes() {
        return transactionTypes;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionTime() {
        return transactionTime;
    }
}
